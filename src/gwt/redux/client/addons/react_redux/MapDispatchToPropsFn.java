package gwt.redux.client.addons.react_redux;

import gwt.react.client.utils.ObjLiteral;
import gwt.redux.client.Dispatch;
import jsinterop.annotations.JsFunction;

@JsFunction
public interface MapDispatchToPropsFn<P> {
    ObjLiteral mapDispatchToProps(Dispatch dispatch, P ownProps);
}
