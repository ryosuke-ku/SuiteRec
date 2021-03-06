public class Formitem {







































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































	public void setType(String type) {
		setAttribute("type", type);
	}

































































































































































































































































































































































































































































































































































































































































































































































































































	public FormItemIcon[] getIcons() {
		return this.icons.get();
	}








	public void setIcons(FormItemIcon... icons) {
		this.icons.set(icons);
	}





	public Object getValue() {
		return getAttributeAsObject(ATTRIBUTE_VALUE);
	}

	public void setValue(Object value) {
		setPropertyAttribute(ATTRIBUTE_VALUE, PROPERTYNAME_VALUE, value);
		requestRepaint();
	}


	public void changeVariables(Object source, Map<String, Object> variables) {
		super.changeVariables(source, variables);

		if (variables.containsKey(ATTRIBUTE_VALUE)) {
			if (FormItemType.BOOLEAN.getValue().equals(getType())) {
				setPropertyAttribute(ATTRIBUTE_VALUE, PROPERTYNAME_VALUE, Boolean.valueOf((String) variables.get(ATTRIBUTE_VALUE)));
			} else {
				setPropertyAttribute(ATTRIBUTE_VALUE, PROPERTYNAME_VALUE, variables.get(ATTRIBUTE_VALUE));
			}
		}
	}

	public void addPropertyChangeListener(PropertyChangeListener listener) {
		propertyChangeSupport.addPropertyChangeListener(listener);
	}

	public void addPropertyChangeListener(String propertyName, PropertyChangeListener listener) {
		propertyChangeSupport.addPropertyChangeListener(propertyName, listener);
	}










	public void paintContent(PaintTarget target) throws PaintException {
		propertyPainter.paintContent(target);
		super.paintContent(target);
	}

















}
