<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<html>
<head>
<title>Sistema de Ventas RTM</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">

<link href="img/stylesheet.css" rel="stylesheet" type="text/css">
<style type="text/css">
<!--
body {
	background-color: #000000;
}
.Estilo2 {
	font-size: 18px;
	color: #FFFFFF;
}
.Estilo3 {
	font-size: 16px;
	font-family: Arial, Helvetica, sans-serif;
	font-weight: bold;
	color: #B8B8B8;
}
.Estilo4 {
	font-size: 36px;
	color: #FFFFFF;
	font-weight: bold;
	font-family: Arial, Helvetica, sans-serif;
}
.Estilo7 {color: #B8B8B8}
.Estilo13 {color: #000000; font-weight: bold; font-family: Arial, Helvetica, sans-serif; font-size: 18px; }
.Estilo17 {color: #000000}
.Estilo18 {color: #000000; font-weight: bold; font-family: Arial, Helvetica, sans-serif; font-size: 12px; }
.Estilo27 {font-family: Arial, Helvetica, sans-serif}
.Estilo52 {font-weight: bold; font-size: 11px; color: #FFFFFF; }
.Estilo44 {font-family: Arial, Helvetica, sans-serif; font-weight: bold; }
.Estilo53 {font-family: Arial, Helvetica, sans-serif; font-size: 11px; }
.Estilo54 {font-size: 11px}
.Estilo55 {font-family: "Times New Roman", Times, serif}
.Estilo58 {font-size: 11px; font-weight: bold; font-family: Arial, Helvetica, sans-serif; }
-->
</style>

<script type="text/javascript">
	
	function siguiente()
	{
		document.formularioDocumentos.accion.value = 'siguiente';
		document.formularioDocumentos.submit();
	}

	function atras()
	{
		document.formularioDocumentos.accion.value = 'atras';
		document.formularioDocumentos.submit();
	}
	
</script>


</head>
<body>
<form name="formularioDocumentos" method="get" action="<%=request.getContextPath()%>/buscarDocumentos.do">
<input type="hidden" name="accion" value=""/>
<table width="100%" bgcolor="#000000">
<tr>
<td height="587" valign="top">
<table cellpadding="0" cellspacing="0" border="0" class="main" align="center" width="70%">
	<tr>
	  <td height="78" colspan="3" align="center"><img src="img/logo.JPG" width="832" height="141"></td>
	</tr>
	<tr>
	  <td height="83" colspan="3" align="center"><p class="Estilo4 Estilo7">BIENVENIDOS A RTM</p>
	    <p class="Estilo2 Estilo3">EMPRESA LIDER EN VENTA DE REPUESTOS </p></td>
	  </tr>
	<tr>
	  <td height="4" colspan="2" valign="middle"><img src="../free_osCommerce_template/sources/html/images/spacer.gif" width="1" height="1"></td>
	  </tr>
	<tr>
	  <td width="20%" height="144" valign="top" bgcolor="#FFFFCC" class="footer"><table width="100%" border="0">
        <tr>
          <td bgcolor="#FFFFCC">&nbsp;</td>
          <td bgcolor="#FFFFCC"><span class="Estilo13">VENDEDOR</span></td>
        </tr>
        <tr>
          <td bgcolor="#FFFFCC">&nbsp;</td>
          <td bgcolor="#FFFFCC"><span class="Estilo17"></span></td>
        </tr>
        <tr>
          <td height="23"><img src="img/bullet1.gif" width="9" height="12"></td>
          <td><a href="<%=request.getContextPath() %>/buscarCliente.do"><span class="Estilo18">Registro de Pedidos</span></a></td>
        </tr>
        <tr>
          <td height="26"><img src="img/bullet1.gif" width="9" height="12"></td>
          <td><a href="#"><span class="Estilo18">Consulta de Existencias</span></a></td>
        </tr>
        <tr>
          <td>&nbsp;</td>
          <td><span class="Estilo17"></span></td>
        </tr>
        <tr>
          <td>&nbsp;</td>
          <td><span class="Estilo17"></span></td>
        </tr>
        <tr>
          <td>&nbsp;</td>
          <td><span class="Estilo17"></span></td>
        </tr>
        <tr>
          <td>&nbsp;</td>
          <td><span class="Estilo17"></span></td>
        </tr>
        <tr>
          <td>&nbsp;</td>
          <td><span class="Estilo17"></span></td>
        </tr>
        <tr>
          <td>&nbsp;</td>
          <td><span class="Estilo17"></span></td>
        </tr>
        <tr>
          <td>&nbsp;</td>
          <td><span class="Estilo17"></span></td>
        </tr>
        <tr>
          <td>&nbsp;</td>
          <td><span class="Estilo17"></span></td>
        </tr>
      </table></td>
	  <td width="80%" valign="top" bgcolor="#FFFFCC" class="footer"><table width="100%" border="0" bgcolor="#FFFFCC">
        <tr>
          <td width="2%"><table width="100%" border="0">
            <tr>
              <th width="1%" scope="row"><span class="Estilo27"></span></th>
              <td colspan="5"><span class="Estilo44">CONSULTA DE DOCUMENTOS DE PAGO PENDIENTES </span></td>
            </tr>
            <tr>
              <th scope="row">&nbsp;</th>
              <td width="17%">&nbsp;</td>
              <td width="14%">&nbsp;</td>
              <td>&nbsp;</td>
              <td>&nbsp;</td>
              <td>&nbsp;</td>
            </tr>
            <tr>
              <th scope="row">&nbsp;</th>
              <td><span class="Estilo27 Estilo54 Estilo40"><strong>Línea de Crédito:</strong></span></td>
              <td colspan="2"><span class="Estilo55"></span><span class="Estilo27"><span class="Estilo53">
                <input name="txtLineaCredito" type="text" id="txtLineaCredito" value="${model.lineaCredito}">
              </span></span></td>
              <td><span class="Estilo27 Estilo54 Estilo40"><strong>Disponible:</strong></span></td>
              <td><span class="Estilo53">
                <input name="txtDisponible" type="text" id="txtDisponible" value="${model.lineaDisponible}">
              </span></td>
            </tr>
            <tr>
              <th scope="row"><span class="Estilo27"></span></th>
              <td>&nbsp;</td>
              <td>&nbsp;</td>
              <td width="19%"><span class="Estilo27"></span></td>
              <td width="19%">&nbsp;</td>
              <td width="30%"><span class="Estilo27"></span></td>
            </tr>
            <tr>
              <th scope="row"><span class="Estilo27"></span></th>
              <td colspan="5" rowspan="5"><table width="100%" border="1">
                  <tr>
                    <th width="4%" bgcolor="#CC0000" class="Estilo27" scope="row"><span class="Estilo52">N°</span></th>
                    <td width="8%" bgcolor="#CC0000" align="center" class="Estilo27"><span class="Estilo52">Tipo Documento</span></td>
                    <td width="21%" bgcolor="#CC0000" class="Estilo27"><span class="Estilo52">Fecha Emision </span></td>
                    <td width="18%" bgcolor="#CC0000" class="Estilo27"><span class="Estilo52">Fecha Vencimiento </span></td>
                    <td width="10%" bgcolor="#CC0000" class="Estilo27"><span class="Estilo52">Dias Mora </span></td>
                    <td width="9%" bgcolor="#CC0000" class="Estilo27"><span class="Estilo52">Moneda</span></td>
                    <td width="17%" bgcolor="#CC0000" class="Estilo27"><span class="Estilo52">Importe Total </span></td>
                  </tr>
                  <c:forEach items="${model.documentosPendientes}" var="documento">
	                 <tr>
	                   <th class="Estilo53" scope="row">${documento.numDocumento}</th>
	                   <th class="Estilo53" scope="row">${documento.tipoDocumento}</th>
	                   <td class="Estilo53"><fmt:formatDate pattern="dd-MM-yyyy" value="${documento.fechaEmision}"/></td>
	                   <td class="Estilo53"><fmt:formatDate pattern="dd-MM-yyyy" value="${documento.fechaVencimiento}"/></td>
	                   <td class="Estilo53">${documento.diasRetraso}</td>
	                   <td class="Estilo53">${documento.moneda}</td>
	                   <td class="Estilo53">${documento.monto}</td>
	                 </tr>                  
                  </c:forEach>
              </table></td>
            </tr>
            <tr>
              <th scope="row"><span class="Estilo27"></span></th>
            </tr>
            <tr>
              <th scope="row"><span class="Estilo27"></span></th>
            </tr>
            <tr>
              <th scope="row">&nbsp;</th>
            </tr>
            <tr>
              <th scope="row">&nbsp;</th>
            </tr>
            <tr>
              <th scope="row"><span class="Estilo27"></span></th>
              <td><span class="Estilo27"></span></td>
              <td><span class="Estilo27"></span></td>
              <td><span class="Estilo27"></span></td>
              <td>&nbsp;</td>
              <td><span class="Estilo27"></span></td>
            </tr>
            <tr>
              <th scope="row"><span class="Estilo27"></span></th>
              <td>&nbsp;</td>
              <td>&nbsp;</td>
              <td>&nbsp;</td>
              <td colspan="2" align="right">&nbsp;</td>
              </tr>
            <tr>
              <th scope="row"><span class="Estilo27"></span></th>
              <td><span class="Estilo27"><a href="javascript:atras();"><img src="img/flechaAtras.jpg" width="52" height="39" border="0"></a></td>
              <td><span class="Estilo27"></span></td>
              <td colspan="2" align="center"><span class="Estilo27"></span><a href="index.jsp"><img src="img/cancelar.jpg" width="36" height="33" border="0"></a></td>
              <td align="right"><a href="javascript:siguiente();"><img src="img/flechaSiguiente.jpg" width="41" height="37" border="0"></a></td>
            </tr>
            <tr>
              <th scope="row"><span class="Estilo27"></span></th>
              <td><span class="Estilo58">Retroceder </span></td>
              <td><span class="Estilo27"></span></td>
              <td colspan="2" align="center"><span class="Estilo58">Cancelar</span><span class="Estilo27"></span></td>
              <td align="right"><span class="Estilo58">Siguiente: </span></td>
            </tr>
            <tr>
              <th scope="row">&nbsp;</th>
              <td>&nbsp;</td>
              <td>&nbsp;</td>
              <td>&nbsp;</td>
              <td>&nbsp;</td>
              <td>&nbsp;</td>
            </tr>
            <tr>
              <th scope="row"><span class="Estilo27"></span></th>
              <td>&nbsp;</td>
              <td>&nbsp;</td>
              <td>&nbsp;</td>
              <td>&nbsp;</td>
              <td>&nbsp;</td>
            </tr>

          </table></td>
        </tr>
      </table></td>
	</tr>
</table>
</td>
</tr>
</table>
</form>
</body>
</html>