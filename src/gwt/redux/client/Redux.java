package gwt.redux.client;

import gwt.react.client.utils.ObjLiteral;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@SuppressWarnings("unused")
@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Redux")
public class Redux {
    public native static <STATE, A extends Action> Store<STATE> createStore(Reducer<STATE, A> theReducer);
    public native static <STATE, A extends Action> Store<STATE> createStore(Reducer<STATE, A> theReducer, STATE initialState);
    public native static <STATE, A extends Action> Store<STATE> createStore(Reducer<STATE, A> theReducer, STATE initialState, StoreEnhancer enhancer);
    public native static <STATE, A extends Action> Store<STATE> createStore(Reducer<STATE, A> theReducer, StoreEnhancer enhancer);

    public native static <STATE, A extends Action> Reducer<STATE, A> combineReducers(ObjLiteral reducersLiteral);
    public native static StoreEnhancer applyMiddleware(Middleware ...middleware);
}