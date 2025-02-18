const checkInput = () => {
	const name = document.getElementById('name').value;
	if (!name) {
		alert("氏名が入力されていません");
		return false;
	}
	return true;
}
