import { BUY_CAKE } from "./cakeTypes"

export const buyCake = (quantity = 1) => {
    console.log(`buyCake - ${quantity}`)
    return {
        type: BUY_CAKE,
        payload: quantity
    }
}