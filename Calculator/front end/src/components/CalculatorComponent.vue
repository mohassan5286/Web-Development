<template>
    <body class="body bg-light" id="body">
        <button class="mode lightmode" id="mode" @click="changeMode">
            <div>  
                <svg v-show = "{isLightMode}" xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="#ffffff" class="bi bi-moon-fill" viewBox="0 0 16 16">
                    <path d="M6 .278a.768.768 0 0 1 .08.858 7.208 7.208 0 0 0-.878 3.46c0 4.021 3.278 7.277 7.318 7.277.527 0 1.04-.055 1.533-.16a.787.787 0 0 1 .81.316.733.733 0 0 1-.031.893A8.349 8.349 0 0 1 8.344 16C3.734 16 0 12.286 0 7.71 0 4.266 2.114 1.312 5.124.06A.752.752 0 0 1 6 .278z"/>
                </svg>
                <svg v-show = "{isDarkmode}" xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="#000000" class="bi bi-sun-fill" viewBox="0 0 16 16">
                    <path d="M8 12a4 4 0 1 0 0-8 4 4 0 0 0 0 8zM8 0a.5.5 0 0 1 .5.5v2a.5.5 0 0 1-1 0v-2A.5.5 0 0 1 8 0zm0 13a.5.5 0 0 1 .5.5v2a.5.5 0 0 1-1 0v-2A.5.5 0 0 1 8 13zm8-5a.5.5 0 0 1-.5.5h-2a.5.5 0 0 1 0-1h2a.5.5 0 0 1 .5.5zM3 8a.5.5 0 0 1-.5.5h-2a.5.5 0 0 1 0-1h2A.5.5 0 0 1 3 8zm10.657-5.657a.5.5 0 0 1 0 .707l-1.414 1.415a.5.5 0 1 1-.707-.708l1.414-1.414a.5.5 0 0 1 .707 0zm-9.193 9.193a.5.5 0 0 1 0 .707L3.05 13.657a.5.5 0 0 1-.707-.707l1.414-1.414a.5.5 0 0 1 .707 0zm9.193 2.121a.5.5 0 0 1-.707 0l-1.414-1.414a.5.5 0 0 1 .707-.707l1.414 1.414a.5.5 0 0 1 0 .707zM4.464 4.465a.5.5 0 0 1-.707 0L2.343 3.05a.5.5 0 1 1 .707-.707l1.414 1.414a.5.5 0 0 1 0 .708z"/>
                </svg>
           </div>
        </button>
        <div class="container">
            <div class="calculator lightmode" id="calculator">
                <form>
                    <div class="display">
                        <input type="text" readonly class="input lightmode" id="input">
                    </div>
                    <div class="buttons lightmode">
                        <button class="button lightmode" type="button" @click = "clear">
                            <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-trash3" viewBox="0 0 16 16">
                                <path d="M6.5 1h3a.5.5 0 0 1 .5.5v1H6v-1a.5.5 0 0 1 .5-.5ZM11 2.5v-1A1.5 1.5 0 0 0 9.5 0h-3A1.5 1.5 0 0 0 5 1.5v1H2.506a.58.58 0 0 0-.01 0H1.5a.5.5 0 0 0 0 1h.538l.853 10.66A2 2 0 0 0 4.885 16h6.23a2 2 0 0 0 1.994-1.84l.853-10.66h.538a.5.5 0 0 0 0-1h-.995a.59.59 0 0 0-.01 0H11Zm1.958 1-.846 10.58a1 1 0 0 1-.997.92h-6.23a1 1 0 0 1-.997-.92L3.042 3.5h9.916Zm-7.487 1a.5.5 0 0 1 .528.47l.5 8.5a.5.5 0 0 1-.998.06L5 5.03a.5.5 0 0 1 .47-.53Zm5.058 0a.5.5 0 0 1 .47.53l-.5 8.5a.5.5 0 1 1-.998-.06l.5-8.5a.5.5 0 0 1 .528-.47ZM8 4.5a.5.5 0 0 1 .5.5v8.5a.5.5 0 0 1-1 0V5a.5.5 0 0 1 .5-.5Z"/>
                            </svg>
                        </button>
                        <button class="button lightmode" type="button" @click = "square">x²</button>
                        <button class="button lightmode" type="button" @click = "squareRoot">√x</button>
                        <button class="button lightmode" type="button" @click = "onDelete">
                            <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-backspace" viewBox="0 0 16 16">
                                <path d="M5.83 5.146a.5.5 0 0 0 0 .708L7.975 8l-2.147 2.146a.5.5 0 0 0 .707.708l2.147-2.147 2.146 2.147a.5.5 0 0 0 .707-.708L9.39 8l2.146-2.146a.5.5 0 0 0-.707-.708L8.683 7.293 6.536 5.146a.5.5 0 0 0-.707 0z"/>
                                <path d="M13.683 1a2 2 0 0 1 2 2v10a2 2 0 0 1-2 2h-7.08a2 2 0 0 1-1.519-.698L.241 8.65a1 1 0 0 1 0-1.302L5.084 1.7A2 2 0 0 1 6.603 1h7.08zm-7.08 1a1 1 0 0 0-.76.35L1 8l4.844 5.65a1 1 0 0 0 .759.35h7.08a1 1 0 0 0 1-1V3a1 1 0 0 0-1-1h-7.08z"/>
                            </svg>
                        </button>
                        <button class="button lightmode" type="button" @click = "reciprocal">1⁄x</button>
                        <button class="button lightmode" type="button" @click = "addOperation('%')">%</button>
                        <button class="button lightmode" type="button" @click = "addOperation('÷')">÷</button>
                        <button class="button lightmode" type="button" @click = "addOperation('×')">×</button>
                        <button class="button lightmode" type="button" @click = "addDigit(7)">7</button>
                        <button class="button lightmode" type="button" @click = "addDigit(8)">8</button>
                        <button class="button lightmode" type="button" @click = "addDigit(9)">9</button>
                        <button class="button lightmode" type="button" @click = "addOperation('-')">-</button>
                        <button class="button lightmode" type="button" @click = "addDigit(4)">4</button>
                        <button class="button lightmode" type="button" @click = "addDigit(5)">5</button>
                        <button class="button lightmode" type="button" @click = "addDigit(6)">6</button>
                        <button class="button lightmode" type="button" @click = "addOperation('+')">+</button>
                        <button class="button lightmode" type="button" @click = "addDigit(1)">1</button>
                        <button class="button lightmode" type="button" @click = "addDigit(2)">2</button>
                        <button class="button lightmode" type="button" @click = "addDigit(3)">3</button>
                        <button class="btn btn-success"  type="button" @click = "evaluation">=</button>
                        <button class="button lightmode" type="button" @click = "negative">±</button>
                        <button class="button lightmode" type="button" @click = "addDigit(0)">0</button>
                        <button class="button lightmode" type="button" @click = "addOperation('.')">.</button>
                    </div>
                </form>
            </div>
        </div>
    </body>
</template>

<script>
export default {

  data : function (){

    return {
        
        isLightmode : true ,
        isDarkmode  : false
    }

  }, 

  name : 'CalculatorComponent',
  
  methods: {

    changeMode : function(){
        const btn        = document.querySelector('.btn')        ;
        const body       = document.getElementById('body')       ;
        const mode       = document.getElementById('mode')       ;
        const input      = document.getElementById('input')      ; 
        const buttons    = document.querySelectorAll('.button')  ;
        const calculator = document.getElementById('calculator') ;

        body.classList.toggle('bg-light') ;
        body.classList.toggle('bg-black') ;

        mode.classList.toggle('lightmode') ;
        mode.classList.toggle('darkmode')  ;

        calculator.classList.toggle('lightmode') ;
        calculator.classList.toggle('darkmode')  ;

        input.classList.toggle('lightmode') ;
        input.classList.toggle('darkmode')  ;

        buttons.forEach(button => {
            button.classList.toggle('lightmode') ;
            button.classList.toggle('darkmode')  ;
        });

        btn.classList.toggle('btn-success') ;
        btn.classList.toggle('btn-warning') ;

        this.isLightMode = !this.isLightMode ;
        this.isDarkmode  = !this.isDarkmode  ;

    },

    addDigit :function (value) {  
      let expression = document.querySelector('input') ;
      
      if (expression.value == "Error Division by zero" || expression.value == "Error Invalid expression")  
        expression.value = "" ;  

      expression.value += value ;
    },

    addOperation: function (value) {
        let expression = document.querySelector('input') ;

        if (expression.value == "Error Division by zero" || expression.value == "Error Invalid expression")  
            expression.value = "" ;  
        
        expression.value += value ;
    },

    onDelete : function(){
        let expression   = document.querySelector('input') ;

        if (expression.value === "Error Division by zero" || expression.value === "Error Invalid expression")
            expression.value  = ""
        
        else
            expression.value = expression.value.toString().slice(0, -1) ;
    },

    clear : function(){
        let expression   = document.querySelector('input') ;
        expression.value = "" ;
    },

    negative : function(){
        let expression = document.querySelector('input') ;
        
        if (expression.value != "" && expression.value != "Error Division by zero" && expression.value != "Error Invalid expression"){

            if (!/[-+÷%×]/.test(expression.value)){

                if (expression.value[0] != '-')
                    expression.value = expression.value.slice(0, 0) + "-" + expression.value.slice(0) ;
                
                else
                    expression.value = expression.value.slice(1) ;
                 
            }

            else if (!(expression.value.slice(-1) === '÷' || expression.value.slice(-1) === '×' || expression.value.slice(-1) === '%' || expression.value.slice(-1) === '+')){

                for(let i = expression.value.length - 1 ; i>= 0 ; i--){
                    
                    if (expression.value[i] === '-'){
                        if (expression.value[i-1] === '-')

                            expression.value = expression.value.slice(0, i) + expression.value.slice(i+1) ;
                        
                        else if (expression.value[i-1] === '÷' || expression.value[i-1] === '×' || expression.value[i-1] === '%' || expression.value[i-1] === '+')    
                            expression.value = expression.value.slice(0, i) + expression.value.slice(i+1) ;


                        else
                            expression.value = expression.value.slice(0, i+1) + '-' + expression.value.slice(i+1) ;

                        break ;   
                    }

                    else if (expression.value[i] === '÷' || expression.value[i] === '×' || expression.value[i] === '%' || expression.value[i] === '+'){
                        expression.value = expression.value.slice(0, i+1) + "-" + expression.value.slice(i+1) ;
                        break ;
                    }

                }

            }

        }

    },

    evaluation : function() {
      
      let expression = document.querySelector('input'); 
      if (expression.value != "" && expression.value != "Error Division by zero" && expression.value != "Error Invalid expression"){  

        fetch('http://localhost:8080/expression/evaluation', {
            method: 'POST',
            
            headers: {
            'Content-Type': 'application/json',
            },
            
            body: expression.value ,
        
        }).then(response => response.text())
        
        .then(data => {
            expression.value = data ;
        })

        .catch(error => {
            console.error('Error sending POST request:', error);
        });
      }
    },

    square : function(){ 
        let expression = document.querySelector('input') ;
        
        if (expression.value != "" && expression.value != "Error Division by zero" && expression.value != "Error Invalid expression"){
            let containOperation = false ;
            let number ;
            let index  ;
            
            if (!/[+%×÷-]/.test(expression.value))
                number = expression.value + "*" + expression.value ;

            else{
                containOperation = true ;
                
                for (index = expression.value.length - 1 ; index>=0 ; index--){
                    if (expression.value[index] == "+" || expression.value[index] == "-" || expression.value[index] == "×" || expression.value[index] == "÷" || expression.value[index] == "%"){
                        number = expression.value.slice(index+1) + '*' + expression.value.slice(index+1) ;
                        break ;
                    }
                }    
            }    
            
            fetch('http://localhost:8080/expression/evaluation', {
                method: 'POST',
                
                headers: {
                'Content-Type': 'application/json',
                },
                
                body: number ,
            
            }).then(response => response.text())
            
            .then(data => {

                if (!containOperation)
                    expression.value = data ;
                
                else    
                    expression.value = expression.value.slice(0, index+1) + data ;
            })

            .catch(error => {
                console.error('Error sending POST request:', error);
            });
        }    
    },

    squareRoot : function() {

        let expression = document.querySelector('input') ;
        
        if (expression.value != "" && expression.value != "Error Division by zero" && expression.value != "Error Invalid expression"){
            let containOperation = false ;
            let number ;
            let index  ;
            
            if (!/[+%×÷-]/.test(expression.value))
                number = `Math.pow(${expression.value}, 1/2)` ;

            else{
                containOperation = true ;
                
                for (index = expression.value.length - 1 ; index>=0 ; index--){
                    if (expression.value[index] == "+" || expression.value[index] == "-" || expression.value[index] == "×" || expression.value[index] == "÷" || expression.value[index] == "%"){ 
                        number =  `Math.pow(${expression.value.slice(index+1)}, 1/2)`;
                        break ;
                    }
                }    
            }    
            
            fetch('http://localhost:8080/expression/evaluation', {
                method: 'POST',
                
                headers: {
                'Content-Type': 'application/json',
                },
                
                body: number ,
            
            }).then(response => response.text())
            
            .then(data => {

                if (!containOperation)
                    expression.value = data ;
                
                else    
                    expression.value = expression.value.slice(0, index+1) + data ;
            })

            .catch(error => {
                console.error('Error sending POST request:', error);
            });
        }    
    },

    reciprocal : function() {
        let expression = document.querySelector('input') ;
        
        if (expression.value != "" && expression.value != "Error Division by zero" && expression.value != "Error Invalid expression"){
            let containOperation = false ;
            let number ;
            let index  ;

            if (!/[+%×÷-]/.test(expression.value))
                number = `Math.pow(${expression.value}, -1)` ;

            else{
                containOperation = true ;
                
                for (index = expression.value.length - 1 ; index>=0 ; index--){
                    if (expression.value[index] == "+" || expression.value[index] == "-" || expression.value[index] == "×" || expression.value[index] == "÷" || expression.value[index] == "%"){ 
                        number =  `Math.pow(${expression.value.slice(index+1)}, -1)`;
                        break ;
                    }
                }    
            }    

            fetch('http://localhost:8080/expression/evaluation', {
                method: 'POST',
                
                headers: {
                'Content-Type': 'application/json',
                },
                
                body: number ,

            }).then(response => response.text())

            .then(data => {

                if (data == "Error Division by zero" || data == "Error Invalid expression")
                    expression.value = data ;

                else{
                    if (!containOperation)
                        expression.value = data ;
                
                    else    
                        expression.value = expression.value.slice(0, index+1) + data ;
                }    
            })

            .catch(error => {
                console.error('Error sending POST request:', error);
            });
        }    
    },

  }
   
}
</script>

<style>
#body {
    margin   : 0      ;
    padding  : 0      ;
    overflow : hidden ;
    height   : 100vh  ;
}

.bg-black{
    transition : background-color 1s ;
}

.bg-light{
    transition : background-color 1s ;
    height     : fit-content;
}

.mode{
    margin-top       : 50px   ;
    margin-left      : 50px   ;
    width            : 80px  ;
    height           : 50px   ;
    border-radius    : 10px   ;
    justify-content  : center ;
    align-items      : center ;
    display          : flex   ;
}

.mode.lightmode{
    background-color : black ; 
    transition       : background-color 1s ;
}

.mode.lightmode div{
    width         : 50px ;
    height        : 30px;
    border-radius : 30px ;
    border        : 2px solid white ;
}

.mode.lightmode:hover{
    box-shadow : 10px 10px 80px rgba(0, 0, 0, .5) ;
    transition : box-shadow 1s ;
}

.mode.lightmode:active{
    box-shadow : 10px 10px 80px rgba(0, 0, 0, 1) ;
    transition : box-shadow .1s ;
}

.mode.darkmode{
    background-color : white ;
    transition       : background-color 1s ;
}

.mode.darkmode div{
    width         : 50px ;
    border-radius : 30px ;
    border        : 2px solid black ;
}

.mode.darkmode:hover{
    box-shadow : 10px 10px 80px rgba(255, 255, 255, .5) ;
    transition : box-shadow 1s ;
}

.mode.darkmode:active{
    box-shadow : 10px 10px 80px rgba(255, 255, 255, 1) ;
    transition: box-shadow .1s ;
}

.container{
    display         : flex   ;
    align-items     : center ;
    justify-content : center ;   
}

.calculator{
    width : 40% ;
}

.calculator.lightmode{
    background-color : white ;
    box-shadow       : 10px 10px 80px rgba(0, 0, 0, .3) ;
    transition       : background-color 1s, box-shadow 1s ;
}

.calculator.darkmode{
    background-color : black ;
    box-shadow       : 10px 10px 80px rgba(255, 255, 255, .15) ;
    transition       : background-color 1s, box-shadow 1s ;
}

form .display{
    display         : flex     ;
    justify-content : flex-end ;
    margin          : 20px     ;
}

form .input{
    border      : 0px   ;
    outline     : 0px   ;
    width       : 100%  ;
    height      : 100px ;     
    text-align  : right ;
    font-size   : 40px  ;   
    font-weight : 100   ;
}

form .input.lightmode{
    background-color : white ;
    color            : black ;
    transition       : background-color 1s, color ;
}

form .input.darkmode{
    background-color : black ;
    color            : white ;
    transition       : background-color 1s, color ;
}

form button{
    border           : 0       ;
    padding          : 0px     ;
    width            : 24.6%   ;
    height           : 110px   ;
    font-size        : 20px    ;
    margin           : 1px     ;
}

form .button.lightmode{
    background-color : white ;
    color            : black ;
    transition       : background-color 1s, color 1s ;
}

form .button.darkmode{
    background-color : black ;
    color            : white ;
    transition       : background-color 1s, color 1s ;
}

form .btn{
    margin-bottom : -113px  ;
    margin-top    : -15px   ;
    height        :  230px  ; 
    grid-row      :  2      ;
    align-items   :  center ;
}

form .button.lightmode:hover{
    background-color : rgba(0, 0, 0, .05)   ;
    transition       :  background-color .01s ;
}

form .button.lightmode:active{
    background-color : rgba(0, 0, 0, .3) ;
    color            : white ;
    transition       :  background-color .01s, color = .01s ;
}

form .button.darkmode:hover{
    background-color : rgba(255, 255, 255, .05) ;
    transition       :  background-color .01s     ;
}

form .button.darkmode:active{
    background-color : rgba(255, 255, 255, .3) ;
    color            : white ;
    transition       :  background-color .01s, color = .01s ;
}

</style>