// Last updated: 6/4/2026, 10:19:39 PM
function createCounter(n: number): () => number {
    
    return function() {
        
        return n++;
    }
}


/** 
 * const counter = createCounter(10)
 * counter() // 10
 * counter() // 11
 * counter() // 12
 */