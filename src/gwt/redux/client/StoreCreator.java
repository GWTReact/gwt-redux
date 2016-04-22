package gwt.redux.client;

import jsinterop.annotations.JsFunction;

@JsFunction
public interface StoreCreator<STATE, A extends Action> {
    Store<STATE> create(Reducer<STATE, A> reducer, STATE initialState);
}
