'use strict';

var listaHorario=[{id:1,diaSemana:'Lunes', horaInicio:'08:00 PM', horaFin:'09:00 PM'},
                   {id:2,diaSemana:'Martes', horaInicio: '10:00 AM', horaFin: '12:00 PM'},
                   {id:3,diaSemana:'Miercoles', horaInicio:'02:00 PM', horaFin: '04:00 PM'}];

module.controller('HorarioCtrl', ['$scope', '$filter', '$http', function ($scope, $filter, $http) {
    //listar
    $scope.lista = listaHorario;
    $scope.id=3;
    
    $scope.datosFormulario = {};
    $scope.panelEditar = false;
    
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
        
        if (!$scope.datosFormulario.id){
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
    $scope.eliminar = function (data){
        if (confirm('\xbfDesea elminar este registro?')) {    
            for(var i=0; i<$scope.lista.length; i++){
                if($scope.lista[i]==data){
                    $scope.lista.splice(i,1);
                    break;
                }
            }
        }
    };
}]);
