public class Dynamicpresentationmodel {











































































































































	public StateModel getStateModel()
	{
		return stateModel;
	}
























































	public void setMapBeanChangeHandler(DynamicPresentationModelMapBeanChangeHandler mapBeanChangeHandler)
	{
		mapChannel.removeValueChangeListener(this.mapBeanChangeHandler);
		this.mapBeanChangeHandler = mapBeanChangeHandler;
		mapChannel.addValueChangeListener(this.mapBeanChangeHandler);
	}

















}
