/** Funciones para mensajes en pantalla*/

function setMensaje(mensaje,modo){
	
	if(mensaje!=null && mensaje!=''){
		if(modo!=null && modo=='info'){
			$("#msj-pantalla").css("background","rgba(150, 230, 180, 0.59)");
			$("#msj-pantalla").css("color","rgba(100, 100, 100,1)");
			$("#msj-pantalla").text(mensaje);
		}else{ //modo error
			$("#msj-pantalla").css("background","rgba(231, 126, 126, 0.49)");
			$("#msj-pantalla").css("color","#ad0d0f");
			$("#msj-pantalla").text(mensaje);
		}
	}else{
		$("#msj-pantalla").css("background","rgba(255, 255, 255, 1)");
		$("#msj-pantalla").text(mensaje);
	}
}




function setMensaje2(mensaje,modo){
	
	if(mensaje!=null && mensaje!=''){
		if(modo!=null && modo=='info'){
			$("#msj-pantalla2").css("background","rgba(150, 230, 180, 0.59)");
			$("#msj-pantalla2").css("color","rgba(100, 100, 100,1)");
			$("#msj-pantalla2").text(mensaje);
		}else{ //modo error
			$("#msj-pantalla2").css("background","rgba(231, 126, 126, 0.49)");
			$("#msj-pantalla2").css("color","#ad0d0f");
			$("#msj-pantalla2").text(mensaje);
		}
	}else{
		$("#msj-pantalla2").css("background","rgba(255, 255, 255, 1)");
		$("#msj-pantalla2").text(mensaje);
	}
}
/** formato fecha */
function getJsonDate(obj) {
    if (obj == undefined | obj==null) return '';
    var dia = obj.date;
    if (dia < 10) dia = '0' + dia;
    var mes = obj.month + 1;
    if (mes < 10) mes = '0' + mes;
    var year = obj.year + 1900;
    var res = dia + '/' + mes + '/' + year;
    return res;
}


/** Funciones desde SabeAdmin */
/** */
function jsOcultar(objeto){
	if (objeto != null) {
		objeto.style.display='none';
	}	
}

/** */
function jsMostrar(objeto){
	if (objeto != null) {
		objeto.style.display='';
	}	
}

/**
 Método que permite validar una cadena de texto si 
 cumple un formato determinado.
 
 Retorna:
 	si cumple retorna true, caso contrario false.
 	 
 Ejemplos:
  /^([0-9])*[.]?[0-9]*$/   Número en decimales
 
*/
function jsValidarMascara(pValor, pFormato) {
	return pFormato.test(pValor);
}

function jsValidarEntero(pValor){
	var pFormato=/^([0-9])*$/;
	return pFormato.test(pValor);
}

function jsValidarDecimal(pValor){
	var pFormato=/^([0-9])*[.]?[0-9]*$/;
	return pFormato.test(pValor);
}

/**
 Método que permite validar si la tecla presionada es
 un caracter que cumple el  formato determinado.
 Retorna:
 	si cumple retorna true, caso contrario false.
 	
 Ejemplos:
  /^([0-9])*[.]?[0-9]*$/   Número en decimales
 
*/
function jsValidarKey(e, pFormato) {
	var charCode;
	var keyCode;
	var tecla;
	var teclaChar;
	
	var browser = navigator.appName;
	if(browser == "Microsoft Internet Explorer"){
		tecla = (document.all) ? event.keyCode : event.which;
		teclaChar = String.fromCharCode(tecla);
		
		  charCode  = event.which;
		  keyCode   = event.keyCode;
		  tecla     = charCode || keyCode;
		  teclaChar = String.fromCharCode(tecla);
		  
		if ((keyCode == 8) || (keyCode == 9) || (keyCode == 13) || (keyCode == 39) ) {
			return true;
		}
		
	} else {
		  charCode  = e.charCode;
		  keyCode   = e.keyCode;
		  tecla     = charCode || keyCode;
		  teclaChar = String.fromCharCode(tecla);
		if ((keyCode == 8) || (keyCode == 9) || (keyCode == 13) || (keyCode == 39) || (keyCode == 46)) {
			return true;
		}
	}	
	
	return pFormato.test(teclaChar);
}

	/**validacion email 18/07/2017 */
	function validarMovil(event){
	   if(jsValidarKey(event,/[0-9]/)){
	        if($("#movil").val().length==0){
	          if(event.charCode==57){
	           return true;
	          }
	        }else{
	          return true;
	        }
	   }
	   return false;
	}

	function validarEmail(value){
	 	emailRegex = /^(([^<>()[\]\.,;:\s@\"]+(\.[^<>()[\]\.,;:\s@\"]+)*)|(\".+\"))@(([^<>()[\]\.,;:\s@\"]+\.)+[^<>()[\]\.,;:\s@\"]{2,})$/i;
		return emailRegex.test(value);
	}
	//validar nombre
	function validarName(value){
		nameRegex =/[A-Za-z]/;
		return nameRegex.test(value);
	}
	
function jsEsEnter(e, pIdObjeto) {
	var charCode;
	var keyCode;
	var tecla;
	var teclaChar;
	var boton = document.getElementById(pIdObjeto);
	
	var browser = navigator.appName;
	
	if(browser == "Microsoft Internet Explorer"){
		tecla = (document.all) ? event.keyCode : event.which;
		teclaChar = String.fromCharCode(tecla);
		
		  charCode  = event.which;
		  keyCode   = event.keyCode;
		  tecla     = charCode || keyCode;
		  teclaChar = String.fromCharCode(tecla);
		  
		if (keyCode == 13) {
			boton.onclick();
		}
		
	} else {
		  charCode  = e.charCode;
		  keyCode   = e.keyCode;
		  tecla     = charCode || keyCode;
		  teclaChar = String.fromCharCode(tecla);
		  
		if (keyCode == 13) {
			boton.onclick();
		}
	}
}

function jsValidarDocumento(pTipo, pNumero) {
	if(pTipo == 1) {
		if(pNumero.length == 8) {
			return true;
		} else {
			return false;
		}
	}

	return false;
}

function jsMinuscula(pId) {
	var cajaTexto = document.getElementById(pId);
	
	cajaTexto.value = cajaTexto.value.toLowerCase();
}

function jsMayuscula(pId) {
	var cajaTexto = document.getElementById(pId);
	
	cajaTexto.value = cajaTexto.value.toUpperCase();
}


/* 
* Description: Funciones y m&eacute;todos para el proyecto Banco de la Naci&oacute;n
* Project: Banco de la Naci&oacute;n
* Date: 21/03/2012
* Author: Medialab Team
* Version: 1.0
*/
var windowSizeArray = [ "width=200,height=200","width=1020,height=600,scrollbars=yes","width=600,height=400,scrollbars=yes", "width=500,height=550,scrollbars=yes"  ];

//Funciones y m&eacute;todos generales



//Metodos Invocados seg&uacute;n petici&oacute;n
var myApp = {
	    Main : {
	        init : function() {                           
	           
	        }
	    },

	   
	    menu : {
	        init : function(){
	        	 $('#niv_uno  a.niv-uno').live('click', function(e){
	        		 e.preventDefault();
	                var self = $(this);
	                var id=self.prop("id");
	                console.log("cargarMennu");
	                
	                $('#pnDerecha',window.parent.document).attr("src","");
	            	 $(".niv-form").each( function(){
	    	    			$(this).css("color","#666666");
	    	            });
	            	$('#niv_uno a.niv-uno').parent().removeClass("active");//quita class=active a TODOS los DEMAS componentes
	                if(self.parent().find("ul").length > 0){
	                            self.parent().find("#niv_tres").hide();
	                            if(self.parent().find("ul").length > 1) self.parent().find("#niv_cuatro").hide();
	                            $('#menu li').find("ul").hide();//repliega
	                            self.parent().find("ul").slideDown('slow');//despliega

	                            self.parent().addClass("active");//adherir a el mismo class active
	                    
	                }else{
                       $('#menu li').find("ul").hide();//repliega        	
	                };
	                

	             });
	        	 
	        	
	      
	         } 	
	    },
	   
	    menu2 : {
	        init : function(){
	        	$('#niv_dos  a.niv-dos').live('click', function(e){
	        		 $(".niv-form").each( function(){
	    	    			$(this).css("color","#666666");
	    	            });
	                var self = $(this);
	                console.log("menu2 "+self);
	                $('#pnDerecha',window.parent.document).attr("src","");
 	                if(self.parent().find("ul").length >0){
 	                	e.preventDefault();
		                $('#niv_dos ul #niv_tres').hide();
		            	$('#niv_dos ul #niv_tres ul #niv_cuatro').hide();
		                //if(self.parent().find("ul").length > 1){//mas de un componente dentro
		            		self.parent().find("#niv_tres").slideDown('slow');//despliega
		                //}
		                //else{
		            	//	self.parent().find("ul #niv_cuatro").slideDown('slow');//despliega
		                //}
	                }
	            });
	      
	         } 	
	    },
	    
	    menu3: {
	    	init : function(){
	    		
	    		$('#niv_tres a.niv-tres').live('click', function(e){

	    			 $(".niv-form").each( function(){
	    	    			$(this).css("color","#666666");
	    	        });
	                var self = $(this);
	                console.log("menu3 "+self);
	                $('#pnDerecha',window.parent.document).attr("src","");
 	                if(self.parent().find("ul").length > 0){
	                	e.preventDefault();
	                	$('#niv_tres ul #niv_cuatro').hide();
	            		self.parent().find("#niv_cuatro").slideDown('slow');//despliega
	                    	
	                };
	    		});
	    	}
	    	
	    },
	    menu4: {
	    	
	    	init : function(){
	    		$('.niv-form').live('click', function(e){
	    			//e.preventDefault();
	    			 var self = $(this);
	    			console.log("menu4 "+self);
	    			$('#pnDerecha',window.parent.document).attr("src","");
	    			  $(".niv-form").each( function(){
	    	    			$(this).css("color","#666666");
	    	    			$(this).parent().removeClass("active");
	    	            });
	    			self.css("color","#c20a13");
	    			self.parent().addClass("active");
	    			
	    		});
	    	}
	    },
	    
    
    

    formRadio:{
        init : function(){
            $("form label.radio").live("click", function(){
                $(this).parent().parent().find("label.radio").css("background-position", "60px -27px");
                $(this).css("background-position", "60px 1px");
            });
        }
    },

    

    formCheckbox :{
        init : function(){
            $("form label.checkbox").bind("click", function(){
                var position = $(this).css("background-position");
                //alert(position);
               
                if (position === "7px 3px")  {
                   // alert("3sd");
                    $(this).css("background-position", "7px -22px");
                    return false;
                }else {
                    $(this).css("background-position", "7px 3px");
                    return false;
                };
            });
        }
    },

    imprimir: {
        init: function(){
            $('#imprimir').click(function() {
                window.print();
                return false;
            });
        }
    },

    calendarToday: {
    	init : function(){
    		$( ".calendarToday" ).datepicker({
    			showOn: "both",
                showStatus: true, 
                buttonImage: "public/images/calendario3.jpg",
                buttonImageOnly: true,
                monthNames: ['Enero', 'Febrero', 'Marzo', 'Abril', 'Mayo', 'Junio',
				'Julio', 'Agosto', 'Septiembre', 'Octubre', 'Noviembre', 'Diciembre'],
				dayNames: ['Domingo', 'Lunes', 'Martes', 'Miércoles', 'Jueves', 'Viernes', 'Sábado'],
				dayNamesShort: ['Dom', 'Lun', 'Mar', 'Mié;', 'Juv', 'Vie', 'Sáb'],
				dayNamesMin: ['Do', 'Lu', 'Ma', 'Mi', 'Ju', 'Vi', 'Sá'],
				dateFormat: 'dd/mm/yy',
				minDate: 1
            });
    	}

    },
    
    calendario: {
        init : function(){
            $( ".calendario" ).datepicker({
                showOn: "both",
                showStatus: true, 
                buttonImage: "public/images/calendario3.jpg",
                buttonImageOnly: true,
                monthNames: ['Enero', 'Febrero', 'Marzo', 'Abril', 'Mayo', 'Junio',
				'Julio', 'Agosto', 'Septiembre', 'Octubre', 'Noviembre', 'Diciembre'],
				dayNames: ['Domingo', 'Lunes', 'Martes', 'Miércoles', 'Jueves', 'Viernes', 'Sábado'],
				dayNamesShort: ['Dom', 'Lun', 'Mar', 'Mié;', 'Juv', 'Vie', 'Sáb'],
				dayNamesMin: ['Do', 'Lu', 'Ma', 'Mi', 'Ju', 'Vi', 'Sá'],
				dateFormat: 'dd/mm/yy',
				changeMonth: true,
			    changeYear: true
            });
            
        }
    
    },
    
        
    selloSeguridad :{
        init : function(){
            $("#sellos ul").each( function(){

                $(this).find("li").last().css("margin", "0");

            });
        }
    },

    curvas : {
        init : function(){
            $('.curvas').corner();
        }
    },

    select : {
        init : function(){
            $('select.select').selectmenu({style:'dropdown'});
        }
    },

     //Menu Lateral
    slideNivo : {
        init : function() {
        }
    },

    //Bug para IE
    fuckIE : {
        init : function() {
        }
    },

    home:{
        init: function(){
            $("#login #login-contenido form .fila").last().css("margin", "0px");
        }
    },
    
    popup : {
        init: function(){
               $('.ventana-emergente').click(function (event){
                                                    //alert("algo");
                var url = $(this).attr("href");
                var windowName = "popUp";//$(this).attr("name");
                var windowSize = windowSizeArray[$(this).attr("rel")];
                var caracteristicas= "scrollTo,resizable=1,scrollbars=1,location=1,"+windowSize;
                //alert(caracteristicas);
                window.open(url, windowName, caracteristicas);
                event.preventDefault();
            });
        }//fin init - popup
    }
    
    
};
myApp.Main.init();