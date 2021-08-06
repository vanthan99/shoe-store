import React, { useState } from 'react';
import PropTypes from 'prop-types';
import { Col, NavItem, Row, Table } from 'reactstrap';
import { render } from '@testing-library/react';

CategoryDataTable.propTypes = {

};

const renderHeaders = () =>
    <thead>
        <tr>
            <th>ID</th>
            <th>Tên Danh Mục</th>
            <th>Status</th>
            <th>Action</th>
        </tr>
    </thead>

function CategoryDataTable(props) {
    const [data,setData] = useState([]);
    const renderRows = () => {
        if(data.length===0){
            return <div>no data</div>;
        }
        
        return data.map(item => 
            <tr>
                <td>{item.id}</td>
                <td>{item.name}</td>
                <td>.</td>
                <td>.</td>
            </tr>
            )
    }
    return (
        <Row className="justify-content-center">
            <Col sm="6">
                <Table hover>
                    {renderHeaders()}
                    <tbody>
                        {renderRows()}
                    </tbody>
                </Table>
            </Col>
        </Row>

    );
}

export default CategoryDataTable;