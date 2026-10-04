% ==========================================

% HECHOS: Información de los alumnos

% ==========================================



alumno(ana).

alumno(luis).

alumno(marta).

alumno(pedro).

alumno(sofia).

alumno(juan).



edad(ana, 15).

edad(luis, 16).

edad(marta, 15).

edad(pedro, 17).

edad(sofia, 16).

edad(juan, 17).



grupo(ana, '1A').

grupo(luis, '1A').

grupo(marta, '1B').

grupo(pedro, '2A').

grupo(sofia, '2A').

grupo(juan, '2B').



promedio(ana, 8.5).

promedio(luis, 7.8).

promedio(marta, 9.2).

promedio(pedro, 8.9).

promedio(sofia, 9.5).

promedio(juan, 7.5).






% Consulta 7: Regla para determinar promedio alto (>= 9.0)

promedio_alto(X) :-

    promedio(X, P),

    P >= 9.0.



% Consulta 8: Regla para determinar si es mayor o igual a 16 años

mayor_o_igual_16(X) :-

    edad(X, E),

    E >= 16