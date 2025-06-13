const toDoList = [
    "create react app",
    "include dependencies",
    "design UI",
    "write unit tests",
    "run test"
]

it('the toDoList has design UI', () => {
    expect(toDoList).toContain('design UI')
})

it('to check presence of stop', () => {
    expect('Christoper').toMatch(/stop/)
})