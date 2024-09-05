useEffect hooks ---> used for dealing with side effects 
		---> it give us power to call / do something once at the time of mounting or at the time of loading or call it when we want

https://react.dev/reference/react/useEffect

useEffect is a React Hook that lets you synchronize a component with an external system.

useEffect(setup, dependencies?)
first parameter is the function that we need to call to do certain tasks - can be a fetch thing 
second parameter is to tell - when we need to run this - run it once, multiple times or to take care of any dependencies - need to pass the dependency list
