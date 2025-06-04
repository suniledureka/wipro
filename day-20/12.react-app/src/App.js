import './App.css';
import Footer from './components/Footer';
import Header from './components/Header';
import TopicsCard from './components/TopicsCard';
import TopicsCard1 from './components/TopicsCard1';
import Welcome from './components/Welcome';
import Welcome1 from './components/Welcome1';

function App() {
  return (
    <>
      <Header/>
      <TopicsCard topic="Lesson-1" title="Web App Dev" slno="1"/>
      <TopicsCard topic="Lesson-2" title="React Into" slno="2"/>
      <TopicsCard topic="Lesson-3" title="Environment Setup" slno="3"/> 
      <hr/>
      <TopicsCard1 topic="Lesson-1" title="Web App Dev" slno="1"/>
      <TopicsCard1 topic="Lesson-2" title="React Into" slno="2"/>
      <TopicsCard1 topic="Lesson-3" title="Environment Setup" slno="3"/> 
     
      <hr/>

      <Welcome guest_name="Sanjay" location="Bangalore"/>
      <Welcome guest_name="Praveen" location="Pune"/>
      <Welcome guest_name="Charles" location="Chennai"/>
      <hr />

      <Welcome1 guest_name="Sanjay" location="Bangalore"/>
      <Welcome1 guest_name="Praveen" location="Pune"/>
      <Welcome1 guest_name="Charles" location="Chennai"></Welcome1>
      
       <Footer />
    </>    
  );
}

export default App;
