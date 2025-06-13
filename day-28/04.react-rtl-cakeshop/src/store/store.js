import { configureStore } from "@reduxjs/toolkit";
import cakeReducer from '../features/cake/cakeSlice'

const store = configureStore({
            reducer: cakeReducer
        })
export default store;        
