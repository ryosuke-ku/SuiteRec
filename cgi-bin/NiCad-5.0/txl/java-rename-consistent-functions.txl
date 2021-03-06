% Consistent renaming - Java functions
% Jim Cordy, May 2010

% Revised July 2018 - update to match new Java 8 grammar - JRC

% Using Java grammar
include "java.grm"

define method_definition
    [method_header]
    '{                     [NL][IN] 
	[method_contents]  [EX] 
    '}
end define

define method_header
    [repeat modifier] [opt generic_parameter] [opt type_specifier] [method_declarator] [opt throws] 
end define

define method_contents
	[repeat declaration_or_statement]     
	[opt expression_statement_no_semi]
end define

define potential_clone
    [method_definition]
end define

% Generic consistent renaming
include "generic-rename-consistent.txl"

