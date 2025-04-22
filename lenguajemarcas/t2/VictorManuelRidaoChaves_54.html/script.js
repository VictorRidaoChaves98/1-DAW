let timeLeft = 900; // 15 minutos
let timeSpent = 0;
let currentChallenge = 1;
let score = 100;
const maxScore = 100;
let interval;

function startGame() {
    document.body.innerHTML = `
        <div id="gameContainer">
            <div id="timer">Tiempo restante: <span id="timeDisplay">30:00</span></div>
            <div id="challengeContainer"></div>
        </div>
    `;
    startTimer();
    loadChallenge();
}

function startTimer() {
    updateTimerDisplay(); // Muestra el tiempo inicial
    interval = setInterval(() => {
        if (timeLeft > 0) {
            timeLeft--;
            updateTimerDisplay();
        } else {
            clearInterval(interval);
            showFinalScore(false); // Fin del tiempo = no logró escapar
        }
    }, 1000);
}

function updateTimerDisplay() {
    let minutes = Math.floor(timeLeft / 60);
    let seconds = timeLeft % 60;
    document.getElementById("timeDisplay").innerText = `${minutes}:${seconds < 10 ? "0" + seconds : seconds}`;
}

function loadChallenge() {
    let challengeHTML = "";
    switch (currentChallenge) {
        case 1:
            challengeHTML = `
                <h1>Prueba 1: Corrige el código HTML</h1>
                <p>Corrige los errores en el siguiente código de una estructura básica de una página web:</p>
                <pre>
                &lt;!DOCTYPE html&gt;
                &lt;html&gt;
                &lt;head&gt;
                    &lt;title&gt;Mi sitio&lt;/title&gt;
                    &lt;meta charset="uft-8">
                    &lt;link rel="stylesheet" href="estilos.css">
                &lt;/head&gt;
                &lt;body&gt;
                    &lt;h1&gt;Bienvenido a mi sitio
                    &lt;p&gt;Este es un párrafo importante
                    &lt;div class="contenedor">
                        Sección principal&lt;/h2&gt;
                        &lt;p&gt;Texto descriptivo.
                    &lt;/div&gt;
                &lt;/body&gt;
                &lt;/html&gt;
                </pre>
                <p>Escribe tus respuestas seguidas, en orden de aparición en el código, separadas por comas.</p>
                <p>Ejemplo de respuesta: &lt;h1&gt;, &lt;/p&gt;, ...</p>
                <input type="text" id="answer" placeholder="Lista de correcciones">
                <button onclick="checkAnswer('Prueba 2', 'utf-8, </h1>, </p>, <h2>, </p>')">Enviar</button>
            `;
            break;

            case 2:
                challengeHTML = `
                    <h1>Prueba 2: Formularios HTML</h1>
                    <p>Corrige los errores en este formulario:</p>
                    <pre>
                    &lt;form action="/enviar" method="post"&gt;
                        &lt;label for="usuario"&gt;Usuario:&lt;/label&gt;
                        &lt;input type="text" id="usuario" nombre="usuario" required&gt;
            
                        &lt;label for="email"&gt;Correo Electrónico:&lt;/label&gt;
                        &lt;input type="text" id="email" name="correo"&gt;
            
                        &lt;label for="password"&gt;Contraseña:&lt;/label&gt;
                        &lt;input type="password" id="password" name="password" minlength="5"&gt;
            
                        &lt;input type="submit" value="Enviar">
                    &lt;/form&gt;
                    </pre>
                    <p>Escribe tus respuestas seguidas, en orden de aparición en el código, separadas por comas, omitiendo comillas.</p>
                    <p>Ejemplo de respuesta: nombre=usuario, form=email, ...</p>
                    <input type="text" id="answer" placeholder="Lista de correcciones">
                    <button onclick="checkAnswer('Prueba 3', 'name=usuario, type=email, name=email')">Enviar</button>
                `;
                break;
            
        case 3:
            challengeHTML = `
                <h1>Prueba 3: CSS - Selectores</h1>
                <p>Corrige los errores en este código de CSS:</p>
                <pre>
                .h1 {
                    fon-size: 20px;
                    color: blue;
                }

                caja {
                    widht: 100px;
                    heigth: 100px;
                    background-color: red;
                    borde-radius: 10px;
                }
                </pre>
                <p>Escribe tus respuestas seguidas, en orden de aparición en el código, separadas por comas.</p>
                <p>Ejemplo de respuesta: display, margin, ...</p>
                <input type="text" id="answer">
                <button onclick="checkAnswer('Prueba 4', 'h1, font-size, .caja, width, height, border-radius')">Enviar</button>
            `;
            break;

        case 4:
            challengeHTML = `
                <h1>Prueba 4: Pseudoclases CSS</h1>
                <p>Selecciona el código correcto para cambiar el color del enlace cuando se ha visitado.</p>
                <button onclick="wrongAnswer()">a:hover { color: red; }</button>
                <button onclick="nextChallenge('Prueba 5')">a:visited { color: red; }</button>
                <button onclick="wrongAnswer()">a:focus { color: red; }</button>
            `;
            break;

        case 5:
            challengeHTML = `
                <h1>Prueba 5: Flexbox</h1>
                <p>Corrige el siguiente código para alinear los elementos correctamente:</p>
                <pre>
                .contenedor {
                    display: block;
                    align-itens: center;
                    justify-contnt: center;
                    flex-direction row;
                }
                </pre>
                <p>Escribe tus respuestas seguidas, en orden de aparición en el código, separadas por comas.</p>
                <p>Ejemplo de respuesta: display, margin, ...</p>
                <input type="text" id="answer">
                <button onclick="checkAnswer('Prueba 6', 'align-items, justify-content, flex-direction: row')">Enviar</button>
            `;
            break;

        case 6:
            challengeHTML = `
                <h1>Prueba 6: Listas HTML</h1>
                <p>Corrige el siguiente código de listas anidadas:</p>
                <pre>
                &lt;ul&gt;
                    &lt;li&gt;Frutas
                        &lt;ol&gt;
                            &lt;li&gt;Manzana
                            &lt;li&gt;Banana
                            &lt;li&gt;Naranja
                        &lt;/ul&gt;
                    &lt;/li&gt;
                &lt;/ul&gt;
                </pre>
                <p>Escribe tus respuestas seguidas, en orden de aparición en el código, separadas por comas.</p>
                <p>Ejemplo de respuesta: display, margin, ...</p>
                <input type="text" id="answer">
                <button onclick="checkAnswer('Fin', '&lt;/ol&gt;')">Enviar</button>
            `;
            break;

        case 7:
            showFinalScore(true);
            return;
    }

    document.getElementById("challengeContainer").innerHTML = `<div class="container">${challengeHTML}<p>Puntuación: <span id="score">${score}</span></p></div>`;
}

function checkAnswer(next, correct) {
    const userAnswer = document.getElementById("answer")?.value.trim();
    if (userAnswer === correct) {
        currentChallenge++;
        loadChallenge();
    } else {
        score -= 10;
        alert("Respuesta incorrecta. Pierdes 10 puntos.");
    }
}

function nextChallenge(next) {
    currentChallenge++; // Avanza al siguiente desafío
    loadChallenge(); // Carga el siguiente desafío
}

function wrongAnswer() {
    score -= 10;
    alert("Respuesta incorrecta. Pierdes 10 puntos.");
}

function showFinalScore(escaped) {
    clearInterval(interval);
    let totalTime = 900 - timeLeft;
    let minutes = Math.floor(totalTime / 60);
    let seconds = totalTime % 60;

    if(escaped) {
        message = `<h1>¡Has escapado con éxito!</h1><p>Puntuación final: ${score}/${maxScore}</p>`;
        if (score === maxScore) {
            message += "<p>🔥 ¡Perfecto! Eres un experto en HTML y CSS. 🔥</p>";
        } else if (score >= 70) {
            message += "<p>✅ Muy bien, pero aún puedes mejorar.</p>";
        } else {
            message += "<p>⚠️ Necesitas practicar más. ¡Inténtalo de nuevo!</p>";
        }
        message += `<p>Tiempo empleado: ${minutes} min ${seconds} seg</p>`;
    }else{
        message = `<h1>¡No lo lograste!</h1><p>⚠️ Necesitas practicar más. ¡Inténtalo de nuevo!</p>`;
    }

    document.body.innerHTML = `<div class="container">${message}</div>`;
}
