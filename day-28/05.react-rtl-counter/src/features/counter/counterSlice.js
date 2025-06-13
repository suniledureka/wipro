import { createSlice } from '@reduxjs/toolkit'

const initialState = {
    count: 0
}

const counterSlice = createSlice({
    name: 'counter',
    initialState: initialState,
    reducers: {
        increment: (state) => {
            state.count++
        },
        decrement: (state) => {
            if(state.count > 0)
             state.count--
        },
        add: (state, action) => {
            state.count += action.payload
        }
    }
})

export const actions = counterSlice.actions  
//export const { increment, decrement, add } = counterSlice.actions
export const counterReducer = counterSlice.reducer