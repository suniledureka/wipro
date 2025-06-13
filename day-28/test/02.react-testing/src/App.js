import "./App.css";
import { Col, Row } from "react-bootstrap";
import Login from "./components/Login";

function App() {
  return (
    <div className="Container app-container" role="parent">
      <Row>
        <Col>
          <h1>React Testing</h1>
        </Col>
      </Row>
      <Row>
        <Col>
          <Login data-testid="child" />
        </Col>
      </Row>
    </div>
  );
};

export default App;
