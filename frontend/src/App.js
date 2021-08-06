import logo from './logo.svg';
import './App.css';
import { Suspense } from 'react';
import { BrowserRouter, Route, Router, Switch } from 'react-router-dom';
import CategoryManager from './pages/CategoryManager/CategoryManager';
import NotFound from './pages/NotFound';
import Menu from './pages/Menu/Menu';
import { Container, Spinner } from 'reactstrap';

function App() {
  return (

    <Suspense fallback={<Spinner color="primary" />}>
      <BrowserRouter>
        <Container>
          <Menu />
          <Switch>
            <Route exact path="/category" component={CategoryManager} />
            <Route component={NotFound} />
          </Switch>
        </Container>
      </BrowserRouter>
    </Suspense>
  );
}

export default App;
