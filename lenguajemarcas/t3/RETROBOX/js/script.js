document.addEventListener('DOMContentLoaded', () => {
    // --- Global DOM Elements ---
    const mainHeader = document.getElementById('mainHeader');
    const mainNav = document.getElementById('mainNav');
    const navToggleButton = document.getElementById('navToggleButton');
    const backToTopButton = document.getElementById('back-to-top');

    // --- Radio Player Logic ---
    const audio = document.getElementById('ncs-audio');
    const radioToggle = document.getElementById('radio-toggle');
    const radioVolume = document.getElementById('radio-volume');
    const radioGlitchText = radioToggle.querySelector('.glitch-text');

    if (audio && radioToggle && radioVolume && radioGlitchText) {
        audio.volume = radioVolume.value; // Set initial volume

        radioToggle.addEventListener('click', () => {
            if (audio.paused) {
                audio.play()
                    .then(() => {
                        console.log('Radio playing');
                        radioGlitchText.textContent = '♪ Radio On';
                        radioGlitchText.setAttribute('data-text', '♪ Radio On');
                    })
                    .catch(error => {
                        console.error('Autoplay prevented:', error);
                        // Provide user instruction if autoplay fails
                        alert('Tu navegador requiere una interacción del usuario para reproducir audio. Haz clic de nuevo o en cualquier otra parte de la página.');
                    });
            } else {
                audio.pause();
                console.log('Radio paused');
                radioGlitchText.textContent = '♪ Radio Off';
                radioGlitchText.setAttribute('data-text', '♪ Radio Off');
            }
        });

        radioVolume.addEventListener('input', () => {
            audio.volume = radioVolume.value;
        });
    }

    // --- Header Shrink & Toggle Logic ---
    const headerThreshold = 100; // Scroll position to trigger header shrink

    const updateHeaderState = () => {
        if (window.scrollY > headerThreshold) {
            mainHeader.classList.add('scrolled');
        } else {
            mainHeader.classList.remove('scrolled');
            // Ensure nav is hidden when unscrolled and back to original state
            mainNav.classList.remove('show-nav');
            navToggleButton.classList.remove('active');
        }
    };

    if (mainHeader && navToggleButton && mainNav) {
        window.addEventListener('scroll', updateHeaderState);
        updateHeaderState(); // Initial check on load

        navToggleButton.addEventListener('click', () => {
            mainNav.classList.toggle('show-nav');
            navToggleButton.classList.toggle('active');
        });

        // Close nav when a link is clicked (for responsive menu)
        mainNav.querySelectorAll('a').forEach(link => {
            link.addEventListener('click', () => {
                if (mainNav.classList.contains('show-nav')) {
                    mainNav.classList.remove('show-nav');
                    navToggleButton.classList.remove('active');
                }
            });
        });
    }


    // --- Back to Top Button Logic ---
    if (backToTopButton) {
        window.addEventListener('scroll', () => {
            if (window.scrollY > 400) { // Show button after scrolling 400px
                backToTopButton.classList.add('show');
            } else {
                backToTopButton.classList.remove('show');
            }
        });

        backToTopButton.addEventListener('click', () => {
            window.scrollTo({
                top: 0,
                behavior: 'smooth'
            });
        });
    }

    // --- Scroll Animation Logic (Intersection Observer) ---
    const animateElements = document.querySelectorAll('.scroll-animate');
    const observerOptions = {
        root: null, // viewport
        rootMargin: '0px',
        threshold: 0.1 // Trigger when 10% of the element is visible
    };

    const observer = new IntersectionObserver((entries, observer) => {
        entries.forEach(entry => {
            if (entry.isIntersecting) {
                entry.target.classList.add('animate');
                observer.unobserve(entry.target); // Stop observing once animated
            }
        });
    }, observerOptions);

    animateElements.forEach(element => {
        observer.observe(element);
    });

    // --- Simulate Data with JSON (for listings and detail pages) ---
    const allGamesData = [
        { id: 1, name: "Mega Man X", platform: "Super Nintendo", price: "29.99", image: "/img/game_thumb1.jpg", detailsLink: "detallecomprar.html", year: 1993, genre: "Plataformas", description: "Un clásico de plataformas de acción, Mega Man X llevó la franquicia a nuevas alturas con su jugabilidad no lineal y mejoras de armadura. ¡Prepárate para la acción futurista!" },
        { id: 2, name: "Sonic the Hedgehog", platform: "Sega Genesis", price: "19.99", image: "/img/game_thumb2.jpg", detailsLink: "detallecomprar.html", year: 1991, genre: "Plataformas", description: "El juego que introdujo al erizo azul más rápido del mundo. Corre a través de niveles vibrantes, recoge anillos y derrota al Dr. Robotnik. Un icono de los 90." },
        { id: 3, name: "Zelda: A Link to the Past", platform: "Super Nintendo", price: "39.99", image: "/img/game_thumb3.jpg", detailsLink: "detallecomprar.html", year: 1991, genre: "Aventura", description: "Considerado uno de los mejores juegos de todos los tiempos. Explora Hyrule, resuelve acertijos y viaja entre dos mundos para salvar a la princesa Zelda." },
        { id: 4, name: "Street Fighter II", platform: "Arcade/SNES", price: "24.99", image: "/img/game_thumb4.jpg", detailsLink: "detallecomprar.html", year: 1991, genre: "Lucha", description: "El rey de los juegos de lucha. Elige entre un elenco diverso de personajes y domina sus movimientos especiales en combates épicos." },
        { id: 5, name: "Chrono Trigger", platform: "Super Nintendo", price: "49.99", image: "/img/game_thumb5.jpg", detailsLink: "detallecomprar.html", year: 1995, genre: "RPG", description: "Una obra maestra del JRPG con viajes en el tiempo, una historia inolvidable y múltiples finales. Imprescindible para cualquier amante del género." },
        { id: 6, name: "Castlevania: SOTN", platform: "PlayStation", price: "34.99", image: "/img/game_thumb6.jpg", detailsLink: "detallecomprar.html", year: 1997, genre: "Acción RPG", description: "Un hito en los juegos de acción-RPG, combinando exploración no lineal con un combate profundo. Adéntrate en el castillo de Drácula como Alucard." },
        { id: 7, name: "Super Metroid", platform: "Super Nintendo", price: "32.99", image: "/img/game_thumb7.jpg", detailsLink: "detallecomprar.html", year: 1994, genre: "Aventura", description: "La aventura de Samus Aran en el planeta Zebes, un referente del género 'Metroidvania'. Gráficos impresionantes y una atmósfera inolvidable." },
        { id: 8, name: "Final Fantasy VII", platform: "PlayStation", price: "45.99", image: "/img/game_thumb8.jpg", detailsLink: "detallecomprar.html", year: 1997, genre: "RPG", description: "El épico RPG que definió una generación. Sigue a Cloud Strife y sus aliados en su lucha contra Shinra y el enigmático Sephiroth. Una historia profunda y memorable." },
        { id: 9, name: "Doom", platform: "PC/Various", price: "15.99", image: "/img/game_thumb9.jpg", detailsLink: "detallecomprar.html", year: 1993, genre: "FPS", description: "El juego que popularizó el género FPS. Elimina demonios en Marte con un arsenal brutal. Un clásico de la acción rápida y visceral." },
        { id: 10, name: "Pokémon Red", platform: "Game Boy", price: "25.99", image: "/img/game_thumb10.jpg", detailsLink: "detallecomprar.html", year: 1996, genre: "RPG", description: "¡Atrapa a todos! Comienza tu viaje como entrenador Pokémon, explora Kanto y conviértete en el campeón. El inicio de un fenómeno global." },
        { id: 11, name: "Donkey Kong Country", platform: "Super Nintendo", price: "28.99", image: "/img/game_thumb11.jpg", detailsLink: "detallecomprar.html", year: 1994, genre: "Plataformas", description: "Un innovador juego de plataformas con gráficos prerenderizados. Ayuda a Donkey Kong y Diddy Kong a recuperar sus plátanos robados." },
        { id: 12, name: "Resident Evil", platform: "PlayStation", price: "22.99", image: "/img/game_thumb12.jpg", detailsLink: "detallecomprar.html", year: 1996, genre: "Survival Horror", description: "El juego que acuñó el término 'survival horror'. Atrapado en una mansión llena de zombies, debes sobrevivir y descubrir la verdad." },
    ];

    const allConsolesData = [
        { id: 1, name: "Nintendo 64", model: "NTSC-U", condition: "Excelente", price: "15.00", includes: "Consola, 1 Mando, Cables AV", image: "/img/console_thumb1.jpg", detailsLink: "detallealquilar.html", description: "Revive la era del 3D con la Nintendo 64. Perfecta para noches de Mario Kart 64 o GoldenEye 007. Incluye todo lo necesario para empezar a jugar."},
        { id: 2, name: "Sega Dreamcast", model: "PAL", condition: "Muy Bueno", price: "12.00", includes: "Consola, 1 Mando, Cable de Corriente", image: "/img/console_thumb2.jpg", detailsLink: "detallealquilar.html", description: "La última consola de Sega. Con su potente hardware y juegos innovadores como Shenmue y Soulcalibur, es una joya para alquilar y descubrir."},
        { id: 3, name: "PlayStation (PS1)", model: "PAL", condition: "Bueno", price: "10.00", includes: "Consola, 1 Mando DualShock, Cables AV", image: "/img/console_thumb3.jpg", detailsLink: "detallealquilar.html", description: "La consola que cambió la historia del gaming. Ideal para revivir clásicos como Final Fantasy VII o Resident Evil. Un viaje a los orígenes del 3D."},
        { id: 4, name: "Super Nintendo (SNES)", model: "PAL", condition: "Excelente", price: "18.00", includes: "Consola, 2 Mandos, Cables AV", image: "/img/console_thumb4.jpg", detailsLink: "detallealquilar.html", description: "La consola de 16 bits por excelencia. Perfecta para disfrutar de juegos legendarios como Super Mario World y Zelda: A Link to the Past. Pura nostalgia."},
    ];


    const loadListings = (data, containerId) => {
        const container = document.getElementById(containerId);
        if (container) {
            container.innerHTML = ''; // Clear previous content
            data.forEach(item => {
                const itemDiv = document.createElement('div');
                itemDiv.classList.add('game-item'); // Using 'game-item' for both for simplicity
                itemDiv.innerHTML = `
                    <img src="${item.image}" alt="${item.name}" class="retro-image">
                    <div class="game-info">
                        <h4>${item.name}</h4>
                        <p>${item.platform || item.model}</p>
                        <span class="price">$${item.price}</span>
                        <a href="${item.detailsLink}?id=${item.id}" class="soft-glitch-button">Detalles</a>
                    </div>
                `;
                container.appendChild(itemDiv);
            });
        }
    };

    const loadDetailPage = (data, type) => {
        const urlParams = new URLSearchParams(window.location.search);
        const itemId = parseInt(urlParams.get('id'));
        const item = data.find(i => i.id === itemId);

        if (item) {
            document.getElementById(`${type}-detail-title`).textContent = item.name;
            document.getElementById('detail-image').src = item.image;
            document.getElementById('detail-image').alt = item.name;
            document.getElementById('detail-description').textContent = item.description;
            document.getElementById('detail-price').textContent = `$${item.price}`;

            if (type === 'game') {
                document.getElementById('detail-platform').textContent = item.platform;
                document.getElementById('detail-year').textContent = item.year;
                document.getElementById('detail-genre').textContent = item.genre;
            } else if (type === 'console') {
                document.getElementById('detail-model').textContent = item.model;
                document.getElementById('detail-condition').textContent = item.condition;
                document.getElementById('detail-includes').textContent = item.includes;
            }

            // Update breadcrumb
            const detailBreadcrumb = document.getElementById('detail-breadcrumb-item');
            if (detailBreadcrumb) {
                detailBreadcrumb.textContent = item.name;
            }

        } else {
            // Redirect to 404 if item not found
            window.location.href = 'notfound.html';
        }
    };

    // Determine current page and load content
    const currentPage = window.location.pathname.split('/').pop().replace('.html', '');

    if (currentPage.startsWith('comprar')) {
        const pageNumber = parseInt(currentPage.replace('comprar', ''));
        const startIndex = (pageNumber - 1) * 6; // 6 items per page
        const endIndex = startIndex + 6;
        loadListings(allGamesData.slice(startIndex, endIndex), 'game-listings');
    } else if (currentPage.startsWith('alquilar')) {
        const pageNumber = parseInt(currentPage.replace('alquilar', ''));
        const startIndex = (pageNumber - 1) * 6; // Assuming 6 items per page for consoles too
        const endIndex = startIndex + 6;
        // Pad console data if less than 6 per page for display consistency
        const consolesToDisplay = allConsolesData.concat(Array(6).fill(null)).slice(startIndex, endIndex).filter(Boolean); // Fill with nulls and filter out
        loadListings(consolesToDisplay, 'game-listings');
    } else if (currentPage === 'detallecomprar') {
        loadDetailPage(allGamesData, 'game');
    } else if (currentPage === 'detallealquilar') {
        loadDetailPage(allConsolesData, 'console');
    } else if (currentPage === 'index') {
        // Load first 3 games for featured section on index page
        loadListings(allGamesData.slice(0, 3), 'game-grid');
    } else if (currentPage === 'notfound') {
        // Trigger 404 page animation immediately
        const notFoundSection = document.querySelector('.not-found-section');
        if (notFoundSection) {
            setTimeout(() => {
                notFoundSection.classList.add('animate');
            }, 100);
        }
    } else if (currentPage === 'contacto') {
        // Handle contact form submission
        const contactForm = document.getElementById('contactForm');
        const formStatus = document.getElementById('form-status');
        if (contactForm && formStatus) {
            contactForm.addEventListener('submit', (e) => {
                e.preventDefault();
                formStatus.textContent = 'Enviando mensaje...';
                formStatus.style.color = 'var(--color-accent-blue)';

                // Simulate API call
                setTimeout(() => {
                    const name = document.getElementById('name').value;
                    const email = document.getElementById('email').value;
                    const message = document.getElementById('message').value;

                    if (name && email && message) {
                        formStatus.textContent = '¡Mensaje enviado con éxito! Te contactaremos pronto.';
                        formStatus.style.color = 'var(--color-accent-green)';
                        contactForm.reset(); // Clear form
                    } else {
                        formStatus.textContent = 'Error: Por favor, rellena todos los campos.';
                        formStatus.style.color = 'var(--color-error)';
                    }
                }, 1500); // Simulate network delay
            });
        }
    }
});