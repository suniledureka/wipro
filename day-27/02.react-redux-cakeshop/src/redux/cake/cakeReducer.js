import { BUY_CAKE } from "./cakeTypes";

const initialState = {
    numOfCakes: 10
}

const cakeReducer = (state = initialState, action) => {
    console.log(action.payload)
    switch(action.type){
        case BUY_CAKE:
          if(state.numOfCakes >= action.payload){  
            return{
                ...state,
               // numOfCakes: state.numOfCakes - 1
               numOfCakes: state.numOfCakes - action.payload
            }
        }
        default:
            return state;    
    }
}

export default cakeReducer;