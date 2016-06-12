package gwt.redux.client.addons.react_redux;

import gwt.interop.utils.client.plainobjects.JsPlainObj;
import gwt.react.client.proptypes.BaseProps;
import jsinterop.annotations.JsFunction;

@JsFunction
public interface MapStateToPropsFn<S, P extends BaseProps> {
    JsPlainObj mapProps(S state, P ownProps);
}
