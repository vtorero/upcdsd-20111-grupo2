<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
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
.Estilo27 {font-family: Arial, Helvetica, sans-serif}
.Estilo44 {font-family: Arial, Helvetica, sans-serif; font-weight: bold; }
.Estilo53 {font-family: Arial, Helvetica, sans-serif; font-size: 11px; }
.Estilo54 {font-size: 11px}
.Estilo56 {font-family: Arial, Helvetica, sans-serif; font-size: 11px; font-weight: bold; }
-->
</style></head>
<body>
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
              <td colspan="5"><span class="Estilo44">CONSULTA TIPO DE PAGO </span></td>
            </tr>
            <tr>
              <th scope="row">&nbsp;</th>
              <td width="15%">&nbsp;</td>
              <td width="26%">&nbsp;</td>
              <td width="15%">&nbsp;</td>
              <td width="26%">&nbsp;</td>
              <td width="15%">&nbsp;</td>
            </tr>
            <tr>
              <th scope="row">&nbsp;</th>
              <td><span class="Estilo27 Estilo54 Estilo40"><strong>Tipo de Pago:</strong></span></td>
              <td><span class="Estilo53">
                <label></label>
                <select name="cboTipoPago" id="cboTipoPago">
                  <option>- Seleccione -</option>
                  <option>Credito</option>
                  <option>Contado</option>
                </select>
              </span></td>
              <td><span class="Estilo27 Estilo54 Estilo40"><strong>Fecha Pago: </strong></span></td>
              <td><span class="Estilo53">
                <input name="txtFechaPago" type="text" id="txtFechaPago">
              </span></td>
              <td>&nbsp;</td>
            </tr>
            <tr>
              <th scope="row">&nbsp;</th>
              <td><span class="Estilo27 Estilo54 Estilo40"><strong>Descuento: </strong></span></td>
              <td><span class="Estilo53">
                <label></label>
                <input name="txtDescuento" type="text" id="txtDescuento">
              </span></td>
              <td><span class="Estilo27 Estilo54 Estilo40"><strong>Moneda: </strong></span></td>
              <td><span class="Estilo53">
                <select name="select" id="select">
                  <option>- Seleccione -</option>
                  <option>Dolares</option>
                  <option>Soles</option>
                  <option>Euros</option>
                </select>
              </span></td>
              <td>&nbsp;</td>
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
              <td><span class="Estilo27"></span></td>
              <td><span class="Estilo27"></span><a href="ConsultaProductos.html"><img src="img/flechaAtras.jpg" width="49" height="36" border="0"></a></td>
              <td colspan="3" align="center"><span class="Estilo27"></span><a href="index.jsp"><img src="img/cancelar.jpg" width="33" height="32" border="0"></a></td>
              <td align="right"><a href="RegistroPedido.jsp"><img src="img/flechaSiguiente.jpg" width="38" height="34" border="0"></a></td>
            </tr>
            <tr>
              <td>&nbsp;</td>
              <td><span class="Estilo54"><span class="Estilo56">Retroceder</span></span></td>
              <td colspan="3" align="center"><span class="Estilo56">Cancelar</span><span class="Estilo54"></span><span class="Estilo54"></span></td>
              <td align="right"><span class="Estilo56">Siguiente</span></td>
            </tr>

          </table></td>
        </tr>
      </table></td>
	</tr>
</table>
</td>
</tr>


</table>


</body>
</html>









