import { useParams } from "react-router"

const UserDetails = () => {
    const params = useParams();
    //console.log(params)
    const uid = params.userId;

    return (
        <div className="card w-25 p-3 bg-dark text-white">
            <h4>Details of User:
                <span className="text-primary fw-bold"> {uid.toUpperCase()} </span>
            </h4>
        </div>
    )
}

export default UserDetails
