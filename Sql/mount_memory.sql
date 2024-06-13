create table if not exists mount_memory(
memory_code varchar(255) not null,
memory_name varchar(255) null,
memory_type varchar(255) null,
snapshot_available varchar(255) null,
gp2_type varchar(255) null,
gp1_type varchar(255) null,
gp3_type varchar(255) null,
zone_level_lock varchar(255) null,
multi_attach varchar(255) null,
single_instance_attach varchar(255) null,
constraint mount_memory_pk primary key(memory_code));