const jwt = require('jsonwebtoken');

const ensureAuthenticated = (req, res, next) => {
    const auth = req.headers['authorization'];
    console.log('im here', auth)
    if (!auth) {
        return res.status(403)
            .json({ message: 'Unauthorized, JWT token is not valid or missing' });
    }
    try {
        const decoded = jwt.verify(auth, process.env.JWT_SECRET);
        req.user = decoded;
        next();
    } catch (err) {
        console.log(err)
        return res.status(403)
            .json({ message: 'Unauthorized, JWT token wrong or expired' });
    }
}

module.exports = ensureAuthenticated;