package template.method;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class GeradorXMLCompactado extends GeradorArquivo {
	@Override
	protected byte[] processar(byte[] bytes) throws IOException {
		ByteArrayOutputStream byteOut = new ByteArrayOutputStream();
		ZipOutputStream out = new ZipOutputStream(byteOut);
		out.putNextEntry(new ZipEntry("internal"));
		out.write(bytes);
		out.closeEntry();
		out.close();
		//return byteOut.toByteArray();
		return bytes;
	}

	@Override
	protected String gerarConteudo(Map<String, Object> props) {
		StringBuilder propFileBuilder = new StringBuilder();
		propFileBuilder.append("<properties>");
		for (String prop : props.keySet()) {
			propFileBuilder.append("<" + prop + ">" + props.get(prop) + "</" + prop + ">");
		}
		propFileBuilder.append("</properties>");
		return propFileBuilder.toString();
	}
	
}
