'use strict';

var listaMatricula = [{id: 1, anio: '2018', semestre: '1', estudiante: {id: 1, nombre: 'Jose', apellidos: 'Velasco Ortiz', codigo: '12552'}, materias: {id: 1, nombre: 'Software II', creditos: '3'}},
    {id: 2, anio: '2018', semestre: '2', estudiante: {id: 1, nombre: 'Jorge', apellidos: 'Catolico Ramirez', codigo: '12552'}, materias: {id: 1, nombre: 'Software II', creditos: '3'}},
    {id: 3, anio: '2018', semestre: '1', estudiante: {id: 1, nombre: 'Yuliana', apellidos: 'Boyaca Aguilar', codigo: '12552'}, materias: {id: 1, nombre: 'Software II', creditos: '3'}}];


module.controller('MatriculaCtrl', ['$scope', '$filter', '$http', function ($scope, $filter, $http) {
        //listar
        $scope.lista = listaMatricula;
        $scope.id = 3;

        $scope.datosFormulario = {};
        $scope.panelEditar = false;

        $scope.listaEstudiantes = listaEstudiantes; //se llama al array de estudiantes del modelo 
        $scope.listaMaterias = listaMaterias;

        //guardar
        $scope.nuevo = function () {
            $scope.panelEditar = true;
            $scope.datosFormulario = {};
        };

        $scope.guardar = function () {
            $scope.errores = {};
            var error = false;

            if (error)
                return;

            if (!$scope.datosFormulario.id) {
                $scope.datosFormulario.id = $scope.id++;
                $scope.lista.push($scope.datosFormulario);
            }
            $scope.panelEditar = false;
        };
        $scope.cancelar = function () {
            $scope.panelEditar = false;
            $scope.datosFormulario = {};
        };

        //editar
        $scope.editar = function (data) {
            $scope.panelEditar = true;
            $scope.datosFormulario = data;
        };
        //eliminar
        $scope.eliminar = function (data) {
            if (confirm('\xbfDesea elminar este registro?')) {
                for (var i = 0; i < $scope.lista.length; i++) {
                    if ($scope.lista[i] == data) {
                        $scope.lista.splice(i, 1);
                        break;
                    }
                }
            }
        };
        
        //define object 
    $scope.CategoriesSelected = [];
    $scope.Categories = [];
    $scope.dropdownSetting = {
        scrollable: true,
        scrollableHeight : '200px'
    }
    //fetch data from database for show in multiselect dropdown
    $http.get('/home/getcategories').then(function (data) {
        angular.forEach(data.data, function (value, index) {
            $scope.Categories.push({ id: value.CategoryID, label: value.CategoryName });
        });
    })
    //post or submit selected items from multiselect dropdown to server
    $scope.SubmittedCategories = [];
    $scope.SubmitData = function () {
        var categoryIds = [];
        angular.forEach($scope.CategoriesSelected, function (value, index) {
            categoryIds.push(value.id);
        });
 
        var data = {
            categoryIds: categoryIds
        };
 
        $http({
            method: "POST",
            url: "/home/savedata",
            data:JSON.stringify(data)
        }).then(function (data) {
            $scope.SubmittedCategories = data.data;
        }, function (error) {
            alert('Error');
        })
    }
    }]);
