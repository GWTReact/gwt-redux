package gwt.redux.client.addons.react_redux;

import gwt.interop.utils.client.plainobjects.JsPlainObj;
import gwt.redux.client.Dispatch;
import jsinterop.annotations.JsFunction;

@JsFunction
public interface MapDispatchToPropsFn<P> {
    JsPlainObj mapDispatchToProps(Dispatch dispatch, P ownProps);
}
