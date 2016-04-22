package gwt.redux.client.addons.react_redux;

import gwt.react.client.components.ReactClass;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "ReactRedux")
public class ReactRedux {
    public static ReactClass<ProviderProps> Provider;

    public static native ConnectToComponentFn connect();
    public static native ConnectToComponentFn connect(MapStateToPropsFn mapStateToProps);
    public static native ConnectToComponentFn connect(MapStateToPropsFn mapStateToProps, MapDispatchToPropsFn mapDispatchToProps);
}
