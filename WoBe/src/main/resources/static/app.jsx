var React = require('react');
var client = require('./client');

var App = React.createClass({
	getInitialState: function() {
		return ({employees: []})
	},
	componentDidMount: function () {
		client({
			method: 'GET', path: '/api/employees'
		}).done(response => {
			this.setState({employees: response.entity._embedded.employees});
		});
	},
	render: function() {
		return (
			<EmployeeList employees={this.state.employees]/>
				)
	}
})


var EmployeeList = React.createClass({
	render: function() {
		var employees = this.props.employees.map(
				employee => <Employee key={
					employee._links.self.href
				}
				employee={employee}/>
			);

		return (
			<table>
				<tr>
					<th>First Name</th>
					<th>Last Name</th>
				</tr>
				{employees}
			</table>
			)
	}
})

var Employee = React.createClass ({
	render: function () {
		return (
			<tr>
				<td>{this.props.employee.firstName}</td>
				<td>{this.props.employee.lastName}</td>
			</tr>
			)
	}
})


React.render(
	<App />,
	document.getElementById('react')
)

