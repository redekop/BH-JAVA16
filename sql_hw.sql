-- Данные о всех сотрудниках в виде: id(сотрудника), имя, зарплата, специальность(название). Отсортировать в порядке увеличения зарплаты.
select emp.id, emp.name, emp.salary, spec.specialty from employees emp, specialties spec
where emp.specialty_id = spec.id
order by emp.salary;

-- Данные о женатых/замужних сотрудниках, имеющих специальность Developer или PM в виде: id(сотрудника), имя, специальность, семейный_статус.
select emp.id, emp.name, spec.specialty, emp.married from employees emp, specialties spec
where emp.specialty_id = spec.id
and emp.married is true
and spec.specialty in ('Developer', 'PM');

-- Количество сотрудников, устроившихся на работу после 1го сентября 2018 года.
select count(*) from employees
where date_of_employment > '2018-09-01';

-- Сумму всех зарплат всех сотрудников.
select sum(salary) from employees;

-- Среднее значение зарплат всех разработчиков и QA
select avg(emp.salary) from employees emp, specialties spec
where emp.specialty_id = spec.id
and spec.specialty in ('Developer', 'QA');

-- Данные о сотрудниках, не участвующих ни в одном проекте, в виде: имя. (Помним про разные типы JOIN)
select emp.name from employees emp
left join employees_to_projects epr on emp.id = epr.empl_id
where epr.proj_id is null;

-- Данные по проектам и сотрудникам на них в виде: проект, имя, специальность. Отсортировать по проекту.
select proj.title, emp.name, spec.specialty from employees emp -- employees_to_projects epr, projects proj
join specialties spec on  spec.id = emp.specialty_id
join employees_to_projects epr on epr.empl_id = emp.id
join projects proj on proj.id = epr.proj_id
order by proj.title;

-- запрос, который выведет данные о сотрудниках, которые задействованы в 2ух и более проектах в виде id, имя, количество проектов сотрудника:
select emp.id, emp.name, count(epr.proj_id) from employees emp
join employees_to_projects epr on emp.id = epr.empl_id
group by emp.id, emp.name
having count(epr.proj_id) > 1;












