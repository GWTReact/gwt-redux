package gwt.redux.client.addons.react_redux;

import gwt.react.client.proptypes.BaseProps;
import gwt.react.client.utils.ObjLiteral;
import jsinterop.annotations.JsFunction;

@JsFunction
public interface MapStateToPropsFn<S, P extends BaseProps> {
    ObjLiteral mapProps(S state, P ownProps);
}
