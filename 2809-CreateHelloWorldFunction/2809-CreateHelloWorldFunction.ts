// Last updated: 6/4/2026, 10:19:24 PM
function createHelloWorld() {
    
    return function(...args): string {
        return 'Hello World';
        
    };
};

/**
 * const f = createHelloWorld();
 * f(); // "Hello World"
 */