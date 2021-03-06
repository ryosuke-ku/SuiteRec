public class Proxyclasscreater {































































































































































	public String createMethods(String className, String methodName, List<Method> methodList, List<String> uniqueNameList) {
		StringBuilder sb = new StringBuilder();
		sb.append("public " + Constant.GAEARESPONSE_CLASS_NAME + " ");
		sb.append(methodName);
		sb.append("(" + Constant.GAEACONTEXT_CLASS_NAME + " context) throws " + Constant.SERVICEFRAMEEXCEPTION_CLASS_NAME + " {");
		
		sb.append(Constant.ICONVERT_CLASS_NAME + " convert = " + Constant.CONVERT_FACTORY_CLASS_NAME + ".getConvert(context.getGaeaRequest().getProtocol());");
		sb.append(Constant.REQUEST_PROTOCOL_CLASS_NAME + " request = (" + Constant.REQUEST_PROTOCOL_CLASS_NAME + ")context.getGaeaRequest().getProtocol().getSdpEntity();");
		sb.append("java.util.List listKV = request.getParaKVList();");
		
		for(Method m : methodList){
			if(m.getName().equalsIgnoreCase(methodName)){
				
				Class<?>[] mType = m.getParameterTypes();
				Type[] mGenericType = m.getGenericParameterTypes();

				sb.append("if(listKV.size() == " + mGenericType.length);
				for(int i=0; i<mGenericType.length; i++) {
					String paraName = mGenericType[i].toString().replaceFirst("class ", "");
					paraName = paraName.replaceAll("java.util.", "").replaceAll("java.lang.", "");
					if(paraName.startsWith(Constant.OUT_PARAM)){
						paraName = paraName.replaceAll(Constant.OUT_PARAM+"<", "");
						paraName = paraName.substring(0, paraName.length() - 1);
						paraName = paraName.replaceAll("\\<.*\\>", "");
					}
					if(paraName.startsWith("[")) {
						paraName = mType[i].getCanonicalName();
					}

					paraName = Util.getSimpleParaName(paraName);
					
					sb.append(" && (");
					sb.append("((" + Constant.KEYVALUEPAIR_PROTOCOL_CLASS_NAME + ")listKV.get(");
					sb.append(i);
					sb.append(")).getKey().toString().equalsIgnoreCase(\"");
					sb.append(paraName);
					sb.append("\")");

					if(paraName.indexOf("int")>=0) {
						sb.append("|| ((" + Constant.KEYVALUEPAIR_PROTOCOL_CLASS_NAME + ")listKV.get(");
						sb.append(i);
						sb.append(")).getKey().toString().equalsIgnoreCase(\"" + paraName.replaceAll("int", "Integer") + "\")");
					} else if(paraName.indexOf("Integer")>=0) {
						sb.append("|| ((" + Constant.KEYVALUEPAIR_PROTOCOL_CLASS_NAME + ")listKV.get(");
						sb.append(i);
						sb.append(")).getKey().toString().equalsIgnoreCase(\"" + paraName.replaceAll("Integer", "int") + "\")");
					} else if(paraName.indexOf("char")>=0) {
						sb.append("|| ((" + Constant.KEYVALUEPAIR_PROTOCOL_CLASS_NAME + ")listKV.get(");
						sb.append(i);
						sb.append(")).getKey().toString().equalsIgnoreCase(\"" + paraName.replaceAll("char", "Character") + "\")");
					} else if(paraName.indexOf("Character")>=0) {
						sb.append("|| ((" + Constant.KEYVALUEPAIR_PROTOCOL_CLASS_NAME + ")listKV.get(");
						sb.append(i);
						sb.append(")).getKey().toString().equalsIgnoreCase(\"" + paraName.replaceAll("Character", "char") + "\")");
					}
					
					
					sb.append(")");
					
				}
				sb.append("){");
				
				sb.append("java.util.List listOutPara = new java.util.ArrayList();");

				//define para
				for(int i=0; i<mGenericType.length;i++){
					String paraName = mGenericType[i].toString().replaceFirst("class ", "");
					boolean isOutPara = false;
					if(paraName.startsWith(Constant.OUT_PARAM)){
						isOutPara = true;
					}
					
					if(paraName.startsWith("[")){
						paraName = mType[i].getCanonicalName();
					}
					if(isOutPara){
						sb.append(Constant.OUT_PARAM + " arg" + i);
						sb.append("= new " + Constant.OUT_PARAM);
						sb.append("();");
					} else {
						sb.append(paraName.replaceAll("\\<.*\\>", ""));
						sb.append(" arg" + i);
					}
					
					if(!isOutPara) {
						paraName = paraName.replaceAll("java.util.", "").replaceAll("java.lang.", "");
						
						if(paraName.equals("long")){
							sb.append(" = 0L;");
						} else if(paraName.equals("float")){
							sb.append(" = 0F;");
						} else if(paraName.equals("double")){
							sb.append(" = 0D;");
						} else if(paraName.equals("int")){
							sb.append(" = 0;");
						} else if(paraName.equals("short")){
							sb.append(" = (short)0;");
						} else if(paraName.equals("byte")){
							sb.append(" = (byte)0;");
						} else if(paraName.equals("boolean")){
							sb.append(" = false;");
						} else if(paraName.equals("char")){
							sb.append(" = (char)'\\0';");
						}
						
						else if(paraName.equals("Long")){
							sb.append(" = new Long(\"0\");");
						} else if(paraName.equals("Float")){
							sb.append(" = new Float(\"0\");");
						} else if(paraName.equals("Double")){
							sb.append(" = new Double(\"0\");");
						} else if(paraName.equals("Integer")){
							sb.append(" = new Integer(\"0\");");
						} else if(paraName.equals("Short")){
							sb.append(" = new Short(\"0\");");
						} else if(paraName.equals("Byte")){
							sb.append(" = new Byte(\"0\");");
						} else if(paraName.equals("Boolean")){
							sb.append(" = new Boolean(\"false\");");
						} else if(paraName.equals("Character")){
							sb.append(" = new Character((char)'\\0');");
						} else{
							sb.append(" = null;");
						}
					}
					if(isOutPara){
						sb.append("listOutPara.add(arg"+i+");");
					}
				}
				
				//set value to para
				if(mGenericType.length > 0) {
					sb.append("try {");
				}
				for(int i=0; i<mGenericType.length;i++){
					String paraName = mGenericType[i].toString().replaceFirst("class ", "");
					boolean isOutPara = false;
					if(paraName.startsWith(Constant.OUT_PARAM)){
						isOutPara = true;
					}
					
					if(paraName.startsWith("[")){
						paraName = mType[i].getCanonicalName();
					}
					
					String pn = paraName.replaceAll("java.util.", "").replaceAll("java.lang.", "");
					if(!isOutPara){
						if (pn.equalsIgnoreCase("String")
								|| pn.equalsIgnoreCase("int") || pn.equalsIgnoreCase("Integer")
								|| pn.equalsIgnoreCase("long")
								|| pn.equalsIgnoreCase("short")
								|| pn.equalsIgnoreCase("float")
								|| pn.equalsIgnoreCase("boolean")
								|| pn.equalsIgnoreCase("double")
								|| pn.equalsIgnoreCase("char") || pn.equalsIgnoreCase("Character")
								|| pn.equalsIgnoreCase("byte")){
							
							sb.append("arg"+i);
							sb.append(" = convert.convertTo"+pn+"(((" + Constant.KEYVALUEPAIR_PROTOCOL_CLASS_NAME + ")listKV.get("+i+")).getValue());");
						} else {
							sb.append("arg"+i);
							sb.append(" = ("+paraName.replaceAll("\\<.*\\>", "")+")convert.convertToT(((" + Constant.KEYVALUEPAIR_PROTOCOL_CLASS_NAME + ")listKV.get("+i+")).getValue(), ");
							sb.append(paraName.replaceAll("<.*?>", "") + ".class");
							
							if(paraName.indexOf("java.util.List") >=0 ||
									paraName.indexOf("java.util.ArrayList") >=0 ||
									paraName.indexOf("java.util.Vector") >=0 ||
									paraName.indexOf("java.util.Set") >=0 ||
									paraName.indexOf("java.util.HashSet") >=0 ) {
								
								sb.append(", ");
								sb.append(paraName.replaceAll("java.util.List<", "")
												  .replaceAll("java.util.ArrayList<", "")
												  .replaceAll("java.util.Vector<", "")
												  .replaceAll("java.util.Set<", "")
												  .replaceAll("java.util.HashSet<", "")
												  .replaceAll(">", "")
								);
								sb.append(".class");
							}
							sb.append(");");
						}
					} else {
						String outType = paraName.replaceAll(Constant.OUT_PARAM + "<", "");
						outType = outType.substring(0, outType.length() - 1);
						
						String outpn = outType.replaceAll("java.util.", "")
						   					  .replaceAll("java.lang.", "");
						
						if (outpn.equalsIgnoreCase("String")
								|| outpn.equalsIgnoreCase("Integer")
								|| outpn.equalsIgnoreCase("Long")
								|| outpn.equalsIgnoreCase("Short")
								|| outpn.equalsIgnoreCase("Float")
								|| outpn.equalsIgnoreCase("Boolean")
								|| outpn.equalsIgnoreCase("Double")
								|| outpn.equalsIgnoreCase("Character")
								|| outpn.equalsIgnoreCase("Byte")){
							
							sb.append("arg"+i);
							sb.append(".setOutPara(convert.convertTo"+outpn+"(((" + Constant.KEYVALUEPAIR_PROTOCOL_CLASS_NAME + ")listKV.get("+i+")).getValue()));");
						} else {
							sb.append("arg"+i);
							sb.append(".setOutPara(("+outType+")convert.convertToT(((" + Constant.KEYVALUEPAIR_PROTOCOL_CLASS_NAME + ")listKV.get("+i+")).getValue(), "+outType+".class");
							
							if(outType.indexOf("java.util.List") >=0 ||
									outType.indexOf("java.util.ArrayList") >=0 ||
									outType.indexOf("java.util.Vector") >=0 ||
									outType.indexOf("java.util.Set") >=0 ||
									outType.indexOf("java.util.HashSet") >=0 ) {
								
								sb.append(", ");
								sb.append(outType.replaceAll("java.util.List<", "")
												 .replaceAll("java.util.ArrayList<", "")
												 .replaceAll("java.util.Vector<", "")
												 .replaceAll("java.util.Set<", "")
												 .replaceAll("java.util.HashSet<", "")
												 .replaceAll(">", "")
								);
								sb.append(".class");
							}
							sb.append("));");
						}
					}
				}
				
				if(mGenericType.length > 0) {
					sb.append("} catch (Exception e) {");
					sb.append("throw new " + Constant.SERVICEFRAMEEXCEPTION_CLASS_NAME + "(\"method:" + className + "." + methodName + "--msg:parse gaeaRequest error\", context.getChannel().getRemoteIP(), context.getChannel().getLocalIP(), context.getGaeaRequest().getProtocol().getSdpEntity(), " + Constant.ERRORSTATE_CLASS_NAME + ".ParaException, e);");
					sb.append("}");
				}
				
				//define returnValue
				Class<?> classReturn = m.getReturnType();
				Type typeReturn = m.getGenericReturnType();
				String returnValueType = typeReturn.toString().replaceFirst("class ", "");
				if(returnValueType.startsWith("[")){
					returnValueType = classReturn.getCanonicalName();
				}
				 
				sb.append("try {");	
				if(!returnValueType.equalsIgnoreCase("void")) {
					sb.append(returnValueType.replaceAll("\\<.*\\>", "") + " returnValue = ");
				} 

				sb.append("serviceProxy.");
				sb.append(m.getName());
				sb.append("(");
				//method para
				for(int i=0; i<mGenericType.length;i++) {
					sb.append("arg");
					sb.append(i);
					if(i != mGenericType.length-1) {
						sb.append(", ");
					}
				}
				sb.append(");");
				
				if(!returnValueType.equalsIgnoreCase("void")) {
					sb.append("return new " + Constant.GAEARESPONSE_CLASS_NAME + "(returnValue");
				} else {
					sb.append("return new " + Constant.GAEARESPONSE_CLASS_NAME + "(null");
				}
				
				
				sb.append(", listOutPara);");
				sb.append("} catch (Exception e) {");
				sb.append("throw new " + Constant.SERVICEFRAMEEXCEPTION_CLASS_NAME + "(\"method:" + className + "." + methodName + "--msg:invoke real service error\", context.getChannel().getRemoteIP(), context.getChannel().getLocalIP(), context.getGaeaRequest().getProtocol().getSdpEntity(), " + Constant.ERRORSTATE_CLASS_NAME + ".ServiceException, e);");
				sb.append("}");

				sb.append("}");
				//end if
			}
		}
		sb.append("throw new " + Constant.SERVICEFRAMEEXCEPTION_CLASS_NAME + "(\"method:" + className + "." + methodName + "--msg:not fond method error\", context.getChannel().getRemoteIP(), context.getChannel().getLocalIP(), context.getGaeaRequest().getProtocol().getSdpEntity(), " + Constant.ERRORSTATE_CLASS_NAME + ".NotFoundMethodException, null);");
		sb.append("}");
		return sb.toString();
	}

}
