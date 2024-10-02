var _solicitud=7;
var _cartaorden=8;
var _cuentaOrigen=18;
var _cci=20;

function validarSolicitud(){
	
	limpiarCampos('solicitud');
    if ($(document.getElementById("formTransfInterb:solicitud")).val().length == _solicitud) {
    	
        bloquearCampos('solicitud');
        //bloquearSelectores();
    } else {
    	desbloquearCampos();
        //desbloquearSelectores();
    }
}

function validarCartaOrd(){
	limpiarCampos('cartaOrden');
    if ($(document.getElementById("formTransfInterb:cartaOrden")).val().length == _cartaorden) {
        bloquearCampos('cartaOrden');
        //bloquearSelectores();
    } else {
        desbloquearCampos();
        //desbloquearSelectores();
    }
	
}

function validarCuentaOrig(){
	
	$(document.getElementById("formTransfInterb:solicitud")).val('');
    $(document.getElementById("formTransfInterb:cartaOrden")).val('');
    $(document.getElementById("formTransfInterb:entidadFinanciera_focus"));
    PF('somEWV').enable();
	 if ($(document.getElementById("formTransfInterb:cuentaOrigen")).val().length == _cuentaOrigen) {
		 
		 $(document.getElementById("formTransfInterb:solicitud")).attr('readonly', true);
         $(document.getElementById("formTransfInterb:cartaOrden")).attr('readonly', true);
         PF('somEFWV').disable();//deshabilita entidad financiera
     } 
	 else {
    	 
    	 $(document.getElementById("formTransfInterb:solicitud")).attr('readonly', false);
         $(document.getElementById("formTransfInterb:cartaOrden")).attr('readonly', false);
         PF('somEFWV').enable();//habilita entidad financiera        
     }
	
}

function validarCci(){//sin _CCI no sirve
	
	if ($(document.getElementById("formTransfInterb:cci")).val().length == _cci) {
        if ($(document.getElementById("formTransfInterb:cuentaOrigen")).val().length == 0) {
        	PF('somEWV').disable();
        }
        $(document.getElementById("formTransfInterb:solicitud")).attr('readonly', true);
        $(document.getElementById("formTransfInterb:cartaOrden")).attr('readonly', true);
        PF('somEFWV').disable();
        //bloquearSelectorEspecifico('entidadFinanciera');
    } else {
    	 $(document.getElementById("formTransfInterb:solicitud")).attr('readonly', false);
         $(document.getElementById("formTransfInterb:cartaOrden")).attr('readonly', false);
         PF('somEFWV').enable();
         PF('somEWV').enable();
        //desbloquearSelectorEspecifico('estado');
    }
	
}

function validarEntidadFin(){
		
	if (PF('somEFWV').getSelectedValue() != '') {
		document.getElementById("formTransfInterb:solicitud").value="";
		$(document.getElementById("formTransfInterb:solicitud")).attr('readonly', true);
		document.getElementById("formTransfInterb:cartaOrden").value="";        
		$(document.getElementById("formTransfInterb:cartaOrden")).attr('readonly', true);
		document.getElementById("formTransfInterb:cuentaOrigen").value="";
        $(document.getElementById("formTransfInterb:cuentaOrigen")).attr('readonly', true);
        document.getElementById("formTransfInterb:cci").value="";
        $(document.getElementById("formTransfInterb:cci")).attr('readonly', true);
    } else {
    	$(document.getElementById("formTransfInterb:solicitud")).attr('readonly', false);
        $(document.getElementById("formTransfInterb:cartaOrden")).attr('readonly', false);
        $(document.getElementById("formTransfInterb:cuentaOrigen")).attr('readonly', false);
        $(document.getElementById("formTransfInterb:cci")).attr('readonly', false);
    }
}

function validarEstado(){
	if (PF('somEWV').getSelectedValue() != '') {
		document.getElementById("formTransfInterb:solicitud").value="";
		document.getElementById("formTransfInterb:cartaOrden").value="";        
		 $(document.getElementById("formTransfInterb:solicitud")).attr('readonly', true);
	     $(document.getElementById("formTransfInterb:cartaOrden")).attr('readonly', true);
     } else {
    	 $(document.getElementById("formTransfInterb:solicitud")).attr('readonly', false);
         $(document.getElementById("formTransfInterb:cartaOrden")).attr('readonly', false);
     }
}


////////////////////////////
function setRazonSocial(){
	
	PF('cbVerifRucWV').disable();
	document.getElementById("formTransfInterb:razon-social_input").value=document.getElementById("formTransfInterb:razon_social").value;
	
}
function setRuc(){
	PF('cbVerifRucWV').disable();
	document.getElementById("formTransfInterb:txtnumeroruc_input").value=document.getElementById("formTransfInterb:nro_ruc").value;
	
}
function valBotonVerifRuc(){
	PF('cbVerifRucWV').enable();
}

function disableBotonVerifRuc(){
	PF('cbVerifRucWV').disable();
}
function ActionBotonVerifRuc(){

	document.getElementById("formTransfInterb:razon-social_input").value=document.getElementById("formTransfInterb:razon_social").value;
	
}


////////////////////////

function fnConsultarTransferencias(){
	console.log("validacion consulta ib");
	
	
	
	var flag = true, msg="";
      var validacion = fnValidacion();
    $.each(validacion, function (key, object) {
        if (object.validation == false) {
        	msg=object.message;
          //  showAlerts(object.message);
            flag = false;
        }
    });
    if (flag == true) {
    	//alert("empezo busqueda");
    	document.getElementById("formTransfInterb:busqValid").value="T";
    	//myCommand();
    }
    else{
    	document.getElementById("formTransfInterb:busqValid").value=msg;
    }
};

function showAlerts(msg) {
    if (msg != '') {
    	//alert(msg);
    	PF('growlWV').renderMessage({"summary":"Error de Validacion",
            "detail":msg,
            "severity":"info"});
    	//setMensaje(msg);

    }
};

function bloquearCampos(excepcion) {
	
    $('input[type=text]').each(function () {
        if ($(this).attr('id') != $(document.getElementById("formTransfInterb:"+excepcion)).attr('id') &&
        	$(this).attr('id') != $(document.getElementById("formTransfInterb:txtnumeroruc_input")).attr('id') &&
        	$(this).attr('id') != $(document.getElementById("formTransfInterb:razon-social_input")).attr('id')) {
        	if($(this).attr('id') == $(document.getElementById("formTransfInterb:entidadFinanciera_focus")).attr('id'))
        		PF('somEFWV').disable();
        	if($(this).attr('id') == $(document.getElementById("formTransfInterb:estado_focus")).attr('id'))
        		PF('somEWV').disable();
        	if($(this).attr('id') == $(document.getElementById("formTransfInterb:fechaInicio_input")).attr('id')){
        		PF('fechaInitWV').disable();
        		PF('fechaFinWV').disable();
        	}
            $(this).attr('readonly', true);
        
        }
    });
};

function desbloquearCampos() {
    $('input[type=text]').each(function () {
    	 $(this).attr('readonly', false);
    	if($(this).attr('id') == $(document.getElementById("formTransfInterb:entidadFinanciera_focus")).attr('id'))
    		PF('somEFWV').enable();
    	if($(this).attr('id') == $(document.getElementById("formTransfInterb:estado_focus")).attr('id'))
    		PF('somEWV').enable();
    	if($(this).attr('id') == $(document.getElementById("formTransfInterb:fechaInicio_input")).attr('id')){
    		PF('fechaInitWV').enable();
    		PF('fechaFinWV').enable();
    	}
    });
};

function limpiarCampos(excepcion) {
    $('input[type=text]').each(function () {
        if ($(this).attr('id') != $(document.getElementById("formTransfInterb:"+excepcion)).attr('id') &&
        		$(this).attr('id') != $(document.getElementById("formTransfInterb:txtnumeroruc_input")).attr('id') &&
        		$(this).attr('id') != $(document.getElementById("formTransfInterb:razon-social_input")).attr('id')) {
        	$(this).val('');
        }
    });
};



function fnValidacion() {
	
    var response = [];
    if ($(document.getElementById("formTransfInterb:cuentaOrigen")).val().length != 0) {
        if (PF('somEWV').getSelectedValue() == '') {
            response.push({
                validation: false,
                message: 'Debe seleccionar un Estado'
            });
        }
    }

    if ($(document.getElementById("formTransfInterb:cci")).val().length != 0) {
        if ($(document.getElementById("formTransfInterb:cuentaOrigen")).val().length == 0) {
            if (($(document.getElementById("formTransfInterb:importeDesde")).val().length == 0 || $(document.getElementById("formTransfInterb:importeHasta")).val().length == 0) && areFechasVacias()) {
                response.push({
                    validation: false,
                    message: 'Debe seleccionar ambas fechas o ambos importes'
                });
            }
        }
    }
    return response;
};


function areFechasVacias() {
	
	if(PF('fechaInitWV').getDate()==null || PF('fechaFinWV').getDate()==null)
		return true;
	else
		return false;
	
};







