import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class AppointmentScheduler {
    public LocalDateTime schedule(String appointmentDateDescription) {
        DateTimeFormatter parser = DateTimeFormatter.ofPattern("MM/d/yyyy HH:mm:ss");
        LocalDateTime parsed = LocalDateTime.parse(appointmentDateDescription, parser);
        return parsed;
    }

    public boolean hasPassed(LocalDateTime appointmentDate) {
        LocalDateTime now = LocalDateTime.now();
        return appointmentDate.isBefore(now);
    }

    public boolean isAfternoonAppointment(LocalDateTime appointmentDate) {
        int timeInMinutes = appointmentDate.getHour()*60 + appointmentDate.getMinute();
        return timeInMinutes>=12*60 && timeInMinutes<18*60;
    }

    public String getDescription(LocalDateTime appointmentDate) {
        DateTimeFormatter printer = DateTimeFormatter.ofPattern("'You have an appointment on' EEEE, MMMM d, yyyy, 'at' h:mm a'.'");
        return printer.format(appointmentDate);
    }

    public LocalDate getAnniversaryDate() {
        LocalDate date = LocalDate.of(LocalDate.now().getYear(), 9, 15);
        return date;
    }
}
