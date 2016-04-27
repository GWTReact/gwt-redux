package gwt.redux.client.addons.redux_undo;

import gwt.redux.client.Action;
import gwt.redux.client.Reducer;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;


@SuppressWarnings("unused")
@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "ReduxUndo")
public class ReduxUndo {
    /**
     * Enhances the supplied reducer to support undo/redo capabilities
     *
     * Wrapping your reducer with undoable makes the state look like this:
     *
     * <pre>
     * {
     *      past: [...pastStatesHere...],
     *      present: {...currentStateHere...},
     *      future: [...futureStatesHere...]
     *  }
     *  </pre>
     *
     * @param baseReducer   The reducer to enhance
     * @return              The enhanced reducer
     */
    @JsMethod
    public native static <STATE, A extends Action> Reducer<STATE, A> undoable(Reducer<STATE, A> baseReducer);

    @JsType(isNative = true)
    public static class ActionCreators {
        /**
         * undo the last action
         *
         * @return The undo action
         */
        public static native Action undo();

        /**
         * redo the last action
         *
         * @return The redo action
         */
        public static native Action redo();

        /**
         * Jump N steps
         *
         * @param steps the number of steps to jump
         *
         * @return The jump action
         */
        public static native Action jump(int steps);

        /**
         * jump to requested index in the past[] array
         *
         * @return The jumpToPast action
         */
        public static native Action jumpToPast(int index);

        /**
         * jump to requested index in the future[] array
         *
         * @return The jumpToFuture action
         */
        public static native Action jumpToFuture(int index);

        /**
         * [beta only] Remove all items from past[] and future[] arrays
         *
         * @return The clearHistory action
         */
        public static native Action clearHistory();
    }
}
