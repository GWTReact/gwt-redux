package gwt.redux.client;

import jsinterop.annotations.JsType;

@JsType(isNative = true)
public class Store<STATE> {

    public native <A extends Action> void dispatch(A theAction);
    public native STATE getState();
    public native Unsubscribe subscribe(Listener listener);
    public native void replaceReducer(Reducer nextReducer);
}
