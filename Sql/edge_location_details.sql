create table if not exists edge_location_details(
edge_location_id Integer not null,
edge_location_code Integer null,
caching_policy varchar(255) null,
cache_invalidation_method varchar(255) null,
cache_behaviour varchar(255) null,
alb_as_origin varchar(255) null,
ec2_as_origin varchar(255) null,
ecs_as_origin varchar(255) null,
geo_restriction varchar(255) null,
signed_url varchar(255) null,
cookies varchar(255) null,
key_groups varchar(255) null,
real_time_logging varchar(255) null,
log_flow varchar(255) null,
constraint edge_location_details_pk primary key(edge_location_id));