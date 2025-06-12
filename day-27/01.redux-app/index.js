const redux = require('redux')
const createStore = redux.legacy_createStore;  //redux.createStore

const ORDER_CAKE = 'ORDER_CAKE';
const RESTOCK_CAKE = 'RESTOKE_CACKE';

const initialState = {
    numOfCakes: 10
}

//action creator - is a function that returns an ACTION
function orderCake() {
    return {
        type: ORDER_CAKE
    }
}

function restockCake(qty = 1) {
    return {
        type: RESTOCK_CAKE,
        payload: qty
    }
}

//create a reducer
const cakeReducer = (state=initialState, action) => {
    console.log(`inside cakeReducer`, state, action)
    switch (action.type) {
        case ORDER_CAKE:
            return {
                ...state,
                numOfCakes: state.numOfCakes - 1
            }
        case RESTOCK_CAKE:
            return {
                ...state,
                numOfCakes: state.numOfCakes + action.payload
            }            
        default:
            return state;    
    }
}

//create a Store
const store = createStore(cakeReducer) //redux.createStore()
console.log(`initial state =  ${store.getState().numOfCakes}`)

//make application to subscribe to changes in the store - store.subscribe(listener)
const unsubscribe = store.subscribe(() => console.log('subscibe() - updated state = ' + store.getState().numOfCakes))

//dispatch an action
store.dispatch(orderCake())
store.dispatch({type: 'ORDER_CAKE'})
store.dispatch(orderCake())
store.dispatch(orderCake())
store.dispatch(orderCake())

store.dispatch(restockCake())
store.dispatch(restockCake(8))

store.dispatch(orderCake())
unsubscribe();
//store.dispatch(orderCake())
