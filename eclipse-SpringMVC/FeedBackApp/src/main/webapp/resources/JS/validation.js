let validateName=(str)=>{
	let regex = /^[a-zA-Z ' ']+$/;
	let result = str.match(regex);
	let span = document.getElementById("sp");
	if(result == null)
	{
		span.innerHTML="Invalid Subject Name";
		span.style.color="red";
	}
	else{
		span.innerHTML=" ";
		checkSubjectExistance(str);
	}
}

let checkSubjectExistance=(str)=>{
	var xhttp=new XMLHttpRequest();
	xhttp.onreadystatechange=function(){
		if(this.readyState==4 && this.status==200)
		{
			//console.log("Subject status "+this.status);
			//alert(this.responseText);
			document.getElementById("sp").innerHTML=this.responseText;
		}
	};
	xhttp.open("GET","checkSubject?subName="+str,true);
	//above URL looks like http://localhost:8080/FeedBackApp/checkSubject?subName=CORE JAVA
	xhttp.send();
}

let searchSubject=(str)=>{
	var xhttp = new XMLHttpRequest();
	xhttp.onreadystatechange=function(){
		if(this.readyState==4 && this.status==200)
		{
			document.getElementById("frmControl").innerHTML=this.responseText;
		}
	};
	xhttp.open("GET","searchSubject?subName="+str,true);
	xhttp.send();
}
let count=0;
let createQualForm=()=>{
	if(count<1)
	{
		let newTextCtrl=document.createElement("input");
		newTextCtrl.setAttribute("type","text");
		newTextCtrl.setAttribute("name","name");
		newTextCtrl.style.width="350px";
		newTextCtrl.style.height="40px";
		newTextCtrl.style.borderRadius="5px";
		
		let heading =document.createElement("h1");
		heading.innerHTML="Add New Qualification";
		
		let btn=document.createElement("input");
		btn.setAttribute("type","submit");
		btn.setAttribute("value","Add New Qualification"); 
		btn.style.marginLeft="20px";
		btn.style.width="350px";
		btn.style.height="40px";
		btn.style.borderRadius="5px";
		
		let parent=document.getElementById("f");
		parent.append(heading);
		newTextCtrl.style.marginLeft="85px";
		parent.append(newTextCtrl);
		parent.append(btn);
		++count;
	}
}




