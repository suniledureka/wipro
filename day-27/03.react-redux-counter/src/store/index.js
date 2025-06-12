import { legacy_createStore as createStore } from 'redux'

export const INCREMENT = 'INCREMENT'
export const DECREMENT = 'DECREMENT'
export const ADD = ' ADD'

const initialState = {
    count: 0
}

const reducer = (state = initialState, action) => {
    switch (action.type) {
        case INCREMENT:
            return {
                count: state.count + 1
            }
        case DECREMENT:
            if (state.count > 0) {
                return {
                    count: state.count - 1
                }
            }
            else
                return state
        case ADD:
            return {
                count: state.count + action.payload
            }

        default:
            return state
    }
}

const store = createStore(reducer);
export default store;