<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@page import="pe.edu.upc.dsd.ws.bean.Stock"%>
<%@page import="java.util.List"%>
<html>
<head>
<title>Untitled</title>
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
.Estilo27 {font-family: Arial, Helvetica, sans-serif, font-size: 11px;}
.Estilo40 {font-family: Arial, Helvetica, sans-serif; font-size: 11px; }
.Estilo44 {font-family: Arial, Helvetica, sans-serif; font-weight: bold; }
.Estilo46 {font-family: Arial, Helvetica, sans-serif; font-size: 11px; font-weight: bold; }
.Estilo75 {color: #FFFFFF; font-weight: bold; font-size: 11px; }
.Estilo76 {font-size: 11px}
-->
</style>

<script type="text/javascript">

	function buscar()
	{
		document.formularioStock.accion.value = 'buscar';
		document.formularioStock.submit();
	}
	
</script>

</head>
<body>
<form name="formularioStock" method="get" action="<%=request.getContextPath()%>/buscarStock.do">
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
          <td bgcolor="#FFFFCC"><img src="img/bullet1.gif" width="9" height="12"></td>
          <td bgcolor="#FFFFCC"><a href="<%=request.getContextPath() %>/buscarCliente.do"><span class="Estilo18">Registro de Pedido </span></a></td>
        </tr>
        <tr>
          <td height="26"><img src="img/bullet1.gif" width="9" height="12"></td>
          <td><a href="<%=request.getContextPath() %>/buscarStock.do"><span class="Estilo18">Consulta de Existencias</span></a></td>
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
              <th width="3%" scope="row"><span class="Estilo27"></span></th>
              <td colspan="5"><span class="Estilo44">CONSULTA DE EXISTENCIAS </span></td>
            </tr>
            <tr>
              <th scope="row"><span class="Estilo27"></span></th>
              <td width="25%"><span class="Estilo27"></span></td>
              <td width="28%"><span class="Estilo27"></span></td>
              <td width="19%"><span class="Estilo27"></span></td>
              <td width="25%">&nbsp;</td>
              <td width="25%"><span class="Estilo27"></span></td>
            </tr>
            <tr>
              <th scope="row"><span class="Estilo27"></span></th>
              <td><span class="Estilo40"><strong>Almacen</strong>: </span></td>
              <td><label>
                <select name="select">
                  <option>Alamcen Lima</option>
                  <option>Almacen Central</option>
                  <option>Almacen Loreto</option>
                </select>
              </label></td>
              <td><span class="Estilo46">Ingrese Datos : </span></td>
              <td><input id="codigoProducto" name="codigoProducto" id="txtNombre"></td>
              <td><span class="Estilo27">
                <input name="btnBuscar" type="submit" id="btnAgregarProductos22" onclick="javascript:buscar();" value="Buscar">
              </span></td>
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
              <td colspan="5" rowspan="5"><table width="100%" border="1">
                  <tr>
                    <th width="4%" bgcolor="#CC0000" class="Estilo27" scope="row"><span class="Estilo75">N°</span></th>
                    <td width="16%" bgcolor="#CC0000" class="Estilo27"><span class="Estilo75">Descripción</span></td>
                    <td width="29%" bgcolor="#CC0000" class="Estilo27"><span class="Estilo75">Stock</span></td>
                    <td width="29%" bgcolor="#CC0000" class="Estilo27"><span class="Estilo75">Almacen</span></td>
                  </tr>
                  <tr>
                    <th class="Estilo27" scope="row">${model.stock.codigoProducto}</th>
                    <td class="Estilo27">${model.stock.descripcion}</td>
                    <td class="Estilo27">${model.stock.stock}</td>
                    <td class="Estilo27">${model.stock.almacen}</td>
                  </tr>                  	
              </table></td>
            </tr>
            <tr>
              <th scope="row"><span class="Estilo27"></span></th>
            </tr>
            <tr>
              <th scope="row"><span class="Estilo27"></span></th>
            </tr>
            <tr>
              <th scope="row"><span class="Estilo27"></span></th>
            </tr>
            <tr>
              <th scope="row"><span class="Estilo27"></span></th>
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
              <td><span class="Estilo27"></span></td>
              <td><span class="Estilo27"></span></td>
              <td><span class="Estilo27"></span></td>
              <td>&nbsp;</td>
              <td align="center"><span class="Estilo27"></span><a href="index.jsp"><img src="img/cancelar.jpg" width="36" height="32" border="0"></a></td>
            </tr>
            <tr>
              <th scope="row"><span class="Estilo27"></span></th>
              <td><span class="Estilo27"></span></td>
              <td><span class="Estilo27"></span></td>
              <td><span class="Estilo27"></span></td>
              <td>&nbsp;</td>
              <td align="center"><span class="Estilo76 Estilo27 Estilo54"><strong>Salir</strong></span></td>
            </tr>
            <tr>
              <th scope="row"><span class="Estilo27"></span></th>
              <td><span class="Estilo27"></span></td>
              <td><span class="Estilo27"></span></td>
              <td><span class="Estilo27"></span></td>
              <td>&nbsp;</td>
              <td><span class="Estilo27"></span></td>
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









