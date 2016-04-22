package gwt.redux.client.addons.react_redux;

import gwt.react.client.proptypes.BaseProps;
import gwt.redux.client.Store;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
public class ProviderProps extends BaseProps {
    public Store<?> store;

    @JsOverlay
    public final ProviderProps Store(Store<?> s) {
        store = s;
        return this;
    }
}
