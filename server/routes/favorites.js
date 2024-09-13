// In favorites.js
const express = require('express')
const router = express.Router()
const favoritesService = require('../services/favorites')

router.get('/favorites', async function(req, res, next) {
    try {
        const data = req.query;
        if(!data.user_id) {
            throw new Error('User ID is required');
        }
        res.json(await favoritesService.getMultiple(data));
    } catch (err) {
        console.error(`Error while getting favorites`, err.message);
        next(err);
    }
});

router.post('/favorites/add', async function(req, res, next) {
    try {
        const data = req.body;
        res.json(await favoritesService.create(data));
    } catch (err) {
        console.error(`Error while creating favorite`, err.message);
        next(err);
    }
});

router.post('/favorites/remove', async function(req, res, next) {
    try {
        const data = req.body;
        res.json(await favoritesService.remove(data));
    } catch (err) {
        console.error(`Error while removing favorite`, err.message);
        next(err);
    }
});

module.exports = router