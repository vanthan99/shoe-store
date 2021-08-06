import React from 'react';
import PropTypes from 'prop-types';
import { Link } from 'react-router-dom';

Menu.propTypes = {

};

function Menu(props) {
    return (
        <>
            <Link to="/category">category manager</Link>
        </>
    );
}

export default Menu;