
const stompClient = new StompJs.Client({
	//brokerURL: 'ws://localhost:8080/maf/gs-guide-websocket'
	brokerURL: 'wss://demo.saigonbpo.vn/maf/gs-guide-websocket'
});


connect()


function connect() {
	stompClient.activate();
}

stompClient.onConnect = (frame) => {
	//setConnected(true);
	console.log('Connected: ' + frame);
	
	stompClient.subscribe('/topic/fetchDataResult', (record) => {
		showData('conversation', JSON.parse(record.body));
	});
	
	stompClient.subscribe('/topic/fetchDataWatch', (record) => {
		showData('watch', JSON.parse(record.body));
	});
	
	stompClient.subscribe('/topic/fetchStatic', (record) => {
	    const now = new Date();
	    const hours = now.getHours().toString().padStart(2, '0');
	    const minutes = now.getMinutes().toString().padStart(2, '0');
	    const seconds = now.getSeconds().toString().padStart(2, '0');
	    const currentTime = `${hours}:${minutes}:${seconds}`;
		$('#static').html(record.body + ' | ' + ` ${currentTime}`  );
	});
};

function showData(idTable, jsonArray) {
	for (let i = 0; i < jsonArray.length; i++) {
		let obj = jsonArray[i];
		mapJsonToTable(idTable, jsonArray);
	}
}

function sendData() {
	stompClient.publish({
		destination: "/topic/fetchDataResult",
		body: ''
	});
}


function mapJsonToTable(idTable, jsonData) {

	$('#' + idTable).html('<thead><tr></tr></thead><tbody></tbody>');
	const table = document.getElementById(idTable);
	const thead = table.querySelector('thead tr');
	const tbody = table.querySelector('tbody');
	let counter = 1; // Initialize a counter variable

	// Add a "No" header to the table
	const thNo = document.createElement('th');
	thNo.textContent = 'No';
	thead.appendChild(thNo);

	// Create table headers from JSON keys
	Object.keys(jsonData[0]).forEach(key => {
		const th = document.createElement('th');
		th.textContent = key;
		thead.appendChild(th);
	});

	// Create table rows from JSON data
	jsonData.forEach(item => {
		const tr = document.createElement('tr');

		// Add a counter cell to the row
		const tdNo = document.createElement('td');
		tdNo.textContent = counter++;
		tr.appendChild(tdNo);

		Object.values(item).forEach(value => {
			const td = document.createElement('td');
			td.textContent = value;
			tr.appendChild(td);
		});

		tbody.appendChild(tr);
	});
}

