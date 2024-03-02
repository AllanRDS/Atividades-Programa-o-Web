var contador = 0;
        var numberarvore = parseInt(Math.random() * 100 + 1); 
        
        function calcular() 
        {
            var value = document.getElementById("valor").value
            
            if (value == numberarvore)
            {
                document.getElementById('resultado').innerHTML = "Você achou o Marcio !!!";
                document.getElementById('dica').innerHTML = "";
                document.getElementById('revelação').innerHTML = "O Marcio estava na árvore : " + numberarvore;
                document.getElementById('botaoenviar').disabled = true;

            }
            else 
            {
                contador += 1;
                document.getElementById('tentativa').innerHTML = "Tentativa : " + contador;

                if (value > numberarvore) 
                {
                    document.getElementById('dica').innerHTML = "A árvore do marciano é menor"
                }
                else 
                {
                    document.getElementById('dica').innerHTML = "A árvore do marciano é maior"
                }

                if (contador > 3) {
                    document.getElementById('resultado').innerHTML = "Game Over."
                    document.getElementById('revelação').innerHTML = "O marciano estava na árvore : " + numberarvore;
                    document.getElementById('botaoenviar').disabled = true;
                }
            }
        }

        function resetar()
        {
            contador = 0;
            numberarvore = parseInt(Math.random() * 100 + 1);
            document.getElementById('valor').value = "";
            document.getElementById('resultado').innerHTML = "";
            document.getElementById('dica').innerHTML = "";
            document.getElementById('revelação').innerHTML = "";
            document.getElementById('tentativa').innerHTML = "";
            document.getElementById('botaoenviar').disabled = false;

        }

        function verificarEnter(Event) 
            {
            if (contador <= 4 && event.key === "Enter") 
            {
                event.preventDefault();
                document.getElementById('botaoenviar').click();
            }            
        }   