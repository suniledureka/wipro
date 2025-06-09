import { Outlet, NavLink } from 'react-router'
import { useSearchParams } from 'react-router'

const Users = () => {
    //const searchParams = useSearchParams();
    //console.log(searchParams)
    const [searchParams, setSearchParams] = useSearchParams();
    //console.log(searchParams)
    const showActiveUsers = searchParams.get("filter") === 'active';

    return (
        <div style={{ textAlign: "left", margin: "20px" }}>

            <button className="btn btn-warning me-5" onClick={() => setSearchParams({filter: 'active', limit: 20})}>Active Users</button>

            <button className="btn btn-primary me-5" onClick={() => setSearchParams({})}> All Users</button>
            
            <hr />
            {
                showActiveUsers ? <p className="text-success">Showing Active Users</p> : <p className="text-danger">Showing All Users</p>
            }
            <hr />

            <p>
                <NavLink to="1">User - 1</NavLink>
            </p>
            <p>
                <NavLink to="2">User - 2</NavLink>
            </p>
            <p>User - 3</p>
            <p>User - 4</p>
            <p>
                <NavLink to="admin">Administrator</NavLink>
            </p>
            <hr />
            <hr />
            <Outlet />
        </div>
    )
}

export default Users
