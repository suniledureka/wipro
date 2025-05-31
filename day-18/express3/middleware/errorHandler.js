const errorHandler = (req, res, next) => {    
    res.status(404).json({message: 'error'})
}

export default errorHandler;
